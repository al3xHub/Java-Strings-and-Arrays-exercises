package es.studium.CuartoEjemploCadenas;

public class CuartoEjemploCadenas
{

	public static void main(String[] args)
	{
		String nombre = "alejandro";
		int edad = 30;
		int a = 7, b = 3;
		
		String cadenaFormateada = "Nuestro amigo %s tiene %d años"; //%s nombra una cadena y %d un entero
		
		System.out.println(String.format(cadenaFormateada, nombre, edad));
		/*
		 * muestra la "cadenaFormateada" más el %s que en este caso hemos nombrado el "nombre" más %d que es el entero "edad"
		 */
		
		System.out.println(a/b); //division normal
		System.out.println((double)a/(double)b); //casting (enmascaramos el entero y lo ponemos real en esa linea). Division de los reales.
		
		String cadenaFormateada2 = "El número %d entre el número %d vale %.2f"; //f indica un numero real y .2 con dos decimales.
		
		System.out.println(String.format(cadenaFormateada2, a, b, (double)a/(double)b ));
		/*
		 * Menciona la cadenaFormateada más el entero a, más b y por último la división de los reales enmascarados.
		 */
	}

}
