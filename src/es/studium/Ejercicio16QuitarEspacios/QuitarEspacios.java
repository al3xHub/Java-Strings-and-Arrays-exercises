package es.studium.Ejercicio16QuitarEspacios;

import java.util.Scanner;

public class QuitarEspacios
{

	public static void main(String[] args)
	{
		String texto1, texto2;
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Dame una cadena");
		texto1 = teclado.nextLine();
		teclado.close();
		
		texto2 =(texto1.replaceAll(" ", ""));
		
		System.out.println(texto2);
	}

}
