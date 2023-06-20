package es.studium.Ejercicio17Suma2;

import java.util.Scanner;

public class Suma2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero, suma=0;
		System.out.print("Indique la longitud del array: ");
		numero=Integer.parseInt(teclado.nextLine());
		int vector[]=new int[numero];
		
		for (int i=0;i<numero;i++)
		{
		System.out.println("Indique el número del array situado en la posición "+i);
		vector[i] = teclado.nextInt();
		
		}
		teclado.close();
		
		
		suma = sumar(numero, vector);
		System.out.println("La suma de todos los elementos del array es: "+suma);
		}
	
	
	public static int sumar(int n, int[] vector)
	{
		int s= 0;
		
		for (int i=0;i<n;i++)
		{
		s+=vector[i];
		}
		return s;
	}

}
