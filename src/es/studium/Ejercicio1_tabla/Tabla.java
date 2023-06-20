package es.studium.Ejercicio1_tabla;

import java.util.Scanner;

public class Tabla
{

	public static void main(String[] args)
	{
		int tabla[] = new int[4];
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<tabla.length; i++)
		{
		System.out.println("Indicar la tabla en la posición " +i+ ":");	
		tabla[i] = teclado.nextInt();
	
		}
		teclado.close();
		
		for(int i=0; i<tabla.length; i++)
		{
			System.out.println("Los resultados de cada posición " +i+ " es: " +tabla[i]);
		}
		
		
	
	}

}
