Algoritmo  RecuentoNumeros
	Definir N1 Como Entero;
	Definir aux Como Entero;
	Definir cont Como Entero;
	
	aux <- 0;
	Hacer
		Escribir "Introduce un n�mero: ";
		Leer N1;
		Si N1 <> -999
			Si N1 >= 0
				Escribir "Es un n�mero positivo";
			SiNo
				Escribir "Es un n�mero negativo";
				aux <- aux +1;
				Escribir " Se han instroducido ", aux, "n�meros negativos";
			FinSi
		FinSi
	Mientras Que N1 <> -999;
	
FinAlgoritmo

