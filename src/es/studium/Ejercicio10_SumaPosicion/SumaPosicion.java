package es.studium.Ejercicio10_SumaPosicion;

import java.util.Scanner;

public class SumaPosicion
{

	public static void main(String[] args)
	{
		final int filas = 10;
		final int columnas = 10;
	
		
		int tabla[][] = new int [filas] [columnas];
		
		Scanner teclado = new Scanner(System.in);
		
		//i + j se sumarán 
		for(int i=0; i<filas; i++)
		{
			for(int j=0; j<columnas; j++)
			{
				tabla[i][j] = i+j;
			}
		}
		
		for(int i=0; i<filas; i++)
		{
			for(int j=0; j<columnas; j++)
			{
				System.out.print("/t" + tabla[i][j]);
			}
			System.out.println(" ");
		}
		teclado.close();
		
		
		
	}

}
