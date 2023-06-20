package es.studium.Ejercicio15_LetraPorPosicion;

import java.util.Scanner;

public class LetraPorPosicion
{

	public static void main(String[] args)
	{
		final int filas = 3;
		final int columnas = 3;
		
		char tablaOriginal [][] = new char [filas][columnas];
		int tablaModificada[][] = new int [filas][columnas];
		int i, j;
		
		Scanner teclado = new Scanner(System.in);
		
		//leer teclado
		for(i=0; i<filas; i++)
		{
			for(j=0; j<columnas; j++)
			{
				System.out.println("dame letras ["+i+"]["+j+"]");
				tablaOriginal[i][j] = teclado.nextLine().charAt(0);
			}
		}
		
		//convertir caracter por numero
		for(i=0; i<filas; i++)
		{
			for(j=0; j<columnas; j++)
			{
			
				tablaModificada[i][j] = tablaOriginal [i][j]-96;
			}
		}
		
		
		//mostrar cambios
		for(i=0;i<filas;i++)
		{
		for(j=0;j<columnas;j++)
		{
		System.out.print(tablaModificada[i][j]+"\t");
		}
		System.out.println();
		
	}

}
}
