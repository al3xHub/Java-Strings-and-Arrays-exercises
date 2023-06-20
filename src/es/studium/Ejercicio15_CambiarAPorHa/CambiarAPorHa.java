package es.studium.Ejercicio15_CambiarAPorHa;

import java.util.Scanner;

public class CambiarAPorHa
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una cadena");
		cadena1 = teclado.nextLine();
		
		cadena2 = (cadena1.replaceAll("a", "ha"));
		
		System.out.println(cadena2);
		teclado.close();
		
		
	}

}
