package es.studium.Ejercicio7_Longitud;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		String cadena1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe lo que te de la gana");
		cadena1 = teclado.nextLine();
		teclado.close();
		
		System.out.println(cadena1.length());
	}

}
