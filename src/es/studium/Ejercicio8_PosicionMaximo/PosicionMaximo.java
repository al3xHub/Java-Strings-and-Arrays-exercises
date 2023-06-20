package es.studium.Ejercicio8_PosicionMaximo;

import java.util.Scanner;

public class PosicionMaximo
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		int tabla[] = new int [MAX];
		int maximo;
		
		Scanner teclado = new Scanner(System.in);
		
		
		//Leer numeros
		for( int i=0; i<MAX; i++)
		{
			System.out.println("Dame un numero para la posicion " +i); 
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		
		//Calcular
		maximo = tabla[0];
		
		for(int i = 0; i < MAX; i++)
		{
			if(tabla[i]>maximo)
			{
				maximo = tabla[i];
			}
		}
		
		System.out.println("El maximo es el " +maximo);
		
		for(int i = 0; i < MAX; i++)
		{
			if (tabla[i]== maximo)
			{
				System.out.println("El maximo se encuentra en la posicion " +i);
			}
		}
		
		
	}

}
