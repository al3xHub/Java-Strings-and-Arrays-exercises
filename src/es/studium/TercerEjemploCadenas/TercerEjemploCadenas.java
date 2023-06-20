package es.studium.TercerEjemploCadenas;

import java.util.Scanner;

public class TercerEjemploCadenas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2;
		
		System.out.println("Escribe una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena");
		cadena2 = teclado.nextLine();
		
		teclado.close();
		
		if(cadena1.equals(cadena2)) 
			/*
			 * .equals sirve para saber si son iguales el CONTENIDO de las cadenas. 
			 * Antes usabamos == pero solo es válido para números int, float, double, byte...
			 */
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas son distintas");
		}
	}

}
