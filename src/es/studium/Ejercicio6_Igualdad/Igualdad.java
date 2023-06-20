package es.studium.Ejercicio6_Igualdad;

import java.util.Scanner;

public class Igualdad
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
		
		if(cadena1.equals(cadena2))
		{
			System.out.println("Las palabras son iguales");
		}
		else
		{
			System.out.println("Las palabras son distintas");
		}
	}

}
