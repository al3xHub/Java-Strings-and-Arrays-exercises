package es.studium.SegundoEjemploCadenas;

import java.util.Scanner;

public class SegundoEjemploCadenas
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String nombre, primerApellido, segundoApellido;
		String nombreCompleto;
		
		System.out.println("Dame tu nombre");
		nombre = teclado.nextLine();
		System.out.println("Dame tu primer apellido");
		primerApellido = teclado.nextLine();
		System.out.println("Dame tu segundo apellido");
		segundoApellido = teclado.nextLine();
		
		teclado.close();
		
		nombreCompleto = nombre + " " +primerApellido+ " " +segundoApellido;
		
		System.out.println("Nombre Completo: " +nombreCompleto);
		
		for(int i=0; i< nombreCompleto.length(); i++)
			/*
			 * Hacemos un bucle en el que la variable i empieza por 0 y termina hasta el caracter final de la cadena nombreCompleto, sumandose de uno en uno
			 */
		{
			System.out.println(nombreCompleto.charAt(i));
		}
		
		
		
	
	}

}
