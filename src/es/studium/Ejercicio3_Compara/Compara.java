package es.studium.Ejercicio3_Compara;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		cadena1 = teclado.nextLine();
		
		System.out.println("Escribe otra palabra");
		cadena2 = teclado.nextLine();
		
		teclado.close();
		
		if(cadena1.length()< cadena2.length())
		{
			System.out.println("La segunda palabra tiene más caracteres");
			
		}
		
		
		if(cadena1.length()> cadena2.length())
		{
			System.out.println("La primera palabra tiene más caracteres");
			
		}
		
		if(cadena1.length()==cadena2.length())
		{
			System.out.println("Las dos palabras tiene los mismos caracteres");
		}
		
		
		
		

		
		
	}

}
