package es.studium.Ejercicio6_contador;

import java.util.Scanner;

public class Contador
{

	public static void main(String[] args)
	{
		final int MAX = 2;
		int contadores[] = new int [MAX];
		
		//contadores[0]= contará los positivos
		//contadores[1]= contará los negativos
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		
		do
		{
			
			System.out.println("Dame un número");
			numero = teclado.nextInt();
			
		if(numero>0)
		{
			contadores[0]++;
		}
		else if(numero<0)
		{
			contadores[1]++;
		}
		
		}while(numero!=0);
		
		teclado.close();
	
		System.out.println("Has introducido " +contadores[0] +" numeros positivos");
		System.out.println("Has introducido " +contadores[1] +" numeros negativos");
	}

}
