package es.studium.Ejercicio4_Concatena;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		String cadena3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		cadena1 = teclado.nextLine();
		
		System.out.println("Escribe otra palabra");
		cadena2 = teclado.nextLine();
		
		teclado.close();
		
		cadena3 = cadena1 + cadena2;
		
		System.out.println(cadena3);
		
		
	}

}
