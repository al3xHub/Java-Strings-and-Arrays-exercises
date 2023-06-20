package es.studium.Ejercicio5_cuadrado;

import java.util.Scanner;

public class Cuadrado
{

	public static void main(String[] args)
	{
		int tabla[]=new int[10];
		int numero1;
		
		Scanner teclado = new Scanner(System.in);	
		System.out.println("Dame un numero kiyo:");
		numero1 = teclado.nextInt();
		teclado.close();	
		
		for(int i=0; i<10; i++)
		{
			tabla[i]= i+(numero1+1);
		}
		for(int i=0; i<10; i++)
		{
			tabla[i]= tabla[i]*tabla[i];
		}
		for(int i=0; i<10; i++)
		{
			System.out.println("Tabla["+i+"]=" +tabla[i]);
		}
	
		
	}

}
