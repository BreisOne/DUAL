Algoritmo Contrasenas
	Definir contr Como Entero;
	Definir aux Como entero;
	
	aux = 3;
	Hacer
		Escribir "Escriba su contraseņa";
		Leer contr;
		Si contr = 111 o contr = 222 o contr = 333
			Escribir "Contraseņa correcta";
		SiNo
			Escribir "Contraseņa incorrecta";
			aux = aux -1;
		FinSi
		
	Mientras Que aux <> 0 y contr <> 111 o contr <> 222 o contr <> 333;
	
	
FinAlgoritmo
	