package es.studium.Ejercicio17EspaciosPrincipio;

import java.util.Scanner;

public class EspaciosPrincipio
{

	public static void main(String[] args)
	{
		String cadena1,resultado;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe lo que quieras");
		cadena1 = teclado.nextLine();
		teclado.close();
		
		resultado = cadena1.trim();
		
		System.out.println(resultado);
		
	
		
		
		
	}

}
