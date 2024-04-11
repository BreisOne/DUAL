package org.flujos.boletin.Exercise_7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise_7 {
    public static void execute(){
        String[] options = {
                "1. Añadir un alumno",
                "2. Modificar el registro de un alumno",
                "3. Eliminar datos de un alumno"};
        String[] subOptions = {
                "1. Modificar/Eliminar el nombre",
                "2. Modificar/Eliminar el apellido",
                "3. Modificar/Eliminar la edad"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Que es lo que quieres hacer?");
        Arrays.stream(options).forEach(System.out::println);
        int userOption = scanner.nextInt();

        switch (userOption){
            case 1:
                addAlumn();
                break;
            case 2:
                System.out.println("Cual es el nombre del alumno que quieres?");
                String userAlumnNameModify = scanner.nextLine();
                System.out.println("Que quieres modificar?");
                Arrays.stream(subOptions).forEach(System.out::println);
                int userOptionModify = scanner.nextInt();
                modifyAlumn(userAlumnNameModify,userOptionModify);
                break;
            case 3:
                System.out.println("Cual es el nombre del alumno que quieres?");
                String userAlumnNameDelete = scanner.nextLine();
                System.out.println("Que quieres eliminar?");
                Arrays.stream(subOptions).forEach(System.out::println);
                int userOptionDelete = scanner.nextInt();
                deleteAlumn(userAlumnNameDelete, userOptionDelete);
                break;
            default:
                System.out.println("No has elegido una opción valida");
        }
    }
    //Main functions of the programme.
    public static void addAlumn(){
        List<Alumno> registerAlumns = readFile();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es el nombre del alumno que quieres dar de alta?");
        String alumnName = scanner.nextLine();
        System.out.println("Cual es el apellido del alumno que quieres dar de alta?");
        String alumnLastname = scanner.nextLine();
        System.out.println("Cual es la edad del alumno que quieres dar de alta?");
        int alumnAge = scanner.nextInt();

        Alumno alumn = new Alumno(alumnName, alumnLastname, alumnAge);

        registerAlumns.add(alumn);
        writeFile(registerAlumns);
    }
    public static void modifyAlumn(String alumnName, int userOption){
        List<Alumno> registerAlumns = readFile();

        Scanner scanner = new Scanner(System.in);

        switch (userOption){
            case 1:
                System.out.println("Cual es el nuevo nombre?");
                String newName = scanner.nextLine();
                registerAlumns.stream().filter(alumno -> alumno.firstName.equalsIgnoreCase(alumnName))
                              .forEach(alumno -> alumno.setFirstName(newName));
                break;
            case 2:
                System.out.println("Cual es el nuevo apellido?");
                String newLastName = scanner.nextLine();
                registerAlumns.stream().filter(alumno -> alumno.firstName.equalsIgnoreCase(alumnName))
                        .forEach(alumno -> alumno.setLastName(newLastName));
                break;
            case 3:
                System.out.println("Cual es la nueva edad?");
                int newAge = scanner.nextInt();
                registerAlumns.stream().filter(alumno -> alumno.firstName.equalsIgnoreCase(alumnName))
                        .forEach(alumno -> alumno.setAge(newAge));
                break;
            default:
                System.out.println("La opción elegida no es valida");

        }
        writefile(registerAlumns);

    }
    public static void deleteAlumn(String alumnName, int userOption){
        List<Alumno> registerAlumns = readFile();

        Scanner scanner = new Scanner(System.in);

        switch (userOption){
            case 1:
                registerAlumns.stream().filter(alumno -> alumno.firstName.equalsIgnoreCase(alumnName))
                              .forEach(alumno -> alumno.setFirstName(null));
                break;
            case 2:
                registerAlumns.stream().filter(alumno -> alumno.firstName.equalsIgnoreCase(alumnName))
                        .forEach(alumno -> alumno.setLastName(null));
                break;
            case 3:
                registerAlumns.stream().filter(alumno -> alumno.firstName.equalsIgnoreCase(alumnName))
                        .forEach(alumno -> alumno.setAge(null));
                break;
            default:
                System.out.println("La opción elegida no es valida");

        }
        writefile(registerAlumns);
    }
    public static List<Alumno> readFile(){
        String fileName = ".\\src\\main\\java\\org\\flujos\\boletin\\Exercise_7\\archivo7.txt";

        try(ObjectInputStream inputStream = new ObjectInputStream( new FileInputStream(fileName))){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
