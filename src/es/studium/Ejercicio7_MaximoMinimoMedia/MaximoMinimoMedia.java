package es.studium.Ejercicio7_MaximoMinimoMedia;

import java.util.Scanner;

public class MaximoMinimoMedia
{

	public static void main(String[] args)
	{
		final int MAX = 10;
		int tabla[] = new int [MAX];
		int suma=0, maximo, minimo;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		
		//con este for o bucle capturamos los datos que introducimos
		
		for(int i = 0; i < MAX; i++) // i dará 10 vueltas
		{
			System.out.println("Dame el numero de la posicion " +i); //dame el numero de la posición primero 0 hasta el 10 (MAX)
			tabla[i] = teclado.nextInt(); //el teclado leera el entero y lo meterá en la tabla.
		}
		teclado.close();
		
		//calcular
		
		for(int i = 0; i < MAX; i++)
		{
			suma = suma + tabla[i];
		}
		
		media = (float) suma/ (float) 10;
		
		maximo = tabla[0];
		
		for(int i = 0; i < MAX; i++)
		{
			if(tabla[i]>maximo)
			{
				maximo = tabla[i];
			}
		}
		
		minimo = tabla[1];
		for(int i = 0; i < MAX; i++)
		{
			if(tabla[i]<minimo)
			{
				minimo = tabla[i];
			}
		}
		
	
		
		//mostrar
		System.out.println("La media vale " + media);
		System.out.println("El maximo es el " + maximo);
		System.out.println("El minimo es el " + minimo);
	}

}
