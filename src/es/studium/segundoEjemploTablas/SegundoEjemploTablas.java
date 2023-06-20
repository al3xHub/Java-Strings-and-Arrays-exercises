package es.studium.segundoEjemploTablas;

import java.util.Scanner;

public class SegundoEjemploTablas
{

	public static void main(String[] args)
	{
		int tabla[] = new int[5]; //tenemos una tabla con 5 posiciones
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<5; i++) // la i será 0 hasta cuando llegue al numero 5.
		{
			System.out.println("Dame el valor de la posición " +i+ ":"); //dame el valor de la posicion 0, dame el valor de la posicion 1, dame el val...5
			tabla[i] = teclado.nextInt();// el teclado leerá la posicion de la tabla 0 que es i, luego leera la posicion 1 que es i luego la posicion 2, luego...
		}
		teclado.close();
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Elemento en la posición " +i+ ":" +tabla[i]);
			// el elemneto de la posicion i( del 0 al 4): leera el valor de la tabla i desde el principio hasta el final.
		}
		
	}

}
