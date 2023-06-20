package es.studium.Ejercicio8_BuscarPosicion;

import java.util.Scanner;

public class BuscarPosicion
{

	public static void main(String[] args)
	{
		String cadena1;
		char caracter1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		cadena1 = teclado.nextLine();
		
		System.out.println("Un caracter");
		caracter1 = teclado.nextLine().charAt(0);
		
		teclado.close();
		
		System.out.println(cadena1);
		System.out.println(caracter1);
	}

}
