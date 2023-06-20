package es.studium.Ejercicio9_DosDimensiones;

import java.util.Scanner;

public class DosDimensiones
{

	public static void main(String[] args)
	{
		 final int FILAS = 3;
		 final int COLUMNAS = 4;
		 char tabla[][] = new char[FILAS] [COLUMNAS];
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 for(int i=0; i<FILAS; i++)
		 {
			 for(int j=0; j<COLUMNAS; j++)
			 {
				 System.out.println("[" +i+","+" " +j+ "]=");
				 tabla[i][j] = teclado.nextLine().charAt(0);
			 }
		 }
		 for(int i=0; i<FILAS; i++)
		 {
			 for(int j=0; j<COLUMNAS; j++)
			 {
				 System.out.print(tabla[i][j]);
				 System.out.print(" ");			 
			 }
			 	System.out.println();
		 }
		 teclado.close();
	}

}
