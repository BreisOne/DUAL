Algoritmo Contrasenas
	Definir contr Como Entero;
	Definir aux Como entero;
	
	aux = 3;
	Hacer
		Escribir "Escriba su contrase�a";
		Leer contr;
		Si contr = 111 o contr = 222 o contr = 333
			Escribir "Contrase�a correcta";
		SiNo
			Escribir "Contrase�a incorrecta";
			aux = aux -1;
		FinSi
		
	Mientras Que aux <> 0 y contr <> 111 o contr <> 222 o contr <> 333;
	
	
FinAlgoritmo
	