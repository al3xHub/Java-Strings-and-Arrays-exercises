package es.studium.Ejercicio1_Nombres;

import java.util.Scanner;

public class Nombres
{

	public static void main(String[] args)
	{
		
		String nombre1, nombre2, nombre3, nombre4, nombre5;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe un primer nombre: ");
		nombre1 = teclado.nextLine();
		
		System.out.println("Escribe un segundo nombre: ");
		nombre2 = teclado.nextLine();
		
		System.out.println("Escribe un tercer nombre: ");
		nombre3 = teclado.nextLine();
		
		System.out.println("Escribe un cuarto nombre: ");
		nombre4 = teclado.nextLine();
		
		System.out.println("Escribe un quinto nombre: ");
		nombre5 = teclado.nextLine();
		
		teclado.close();
		
		String cadenaFormateada = "Los 5 nombres son: %s, %s, %s, %s, %s,";
		
		System.out.println(String.format(cadenaFormateada, nombre1, nombre2, nombre3, nombre4, nombre5));
		
	}

}
