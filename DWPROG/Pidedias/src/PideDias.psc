Algoritmo PideDias
	
	Definir userInput Como Entero;
	Definir contador Como Entero;
	
	Escribir "Introduce un n�mero";
	Leer userInput;
	
	Mientras userInput<> -1 Hacer
		
		si userInput <1 | userInput > 31 Entonces
			Escribir "Error_d�a invalido";
		SiNo
			contador = contador+1
		FinSi
		
		Escribir "Introduce un n�mero";
		Leer userInput;
	FinMientras
	
	Escribir"Se ha introducido un total de " contador " d�as validos";
	
FinAlgoritmo
