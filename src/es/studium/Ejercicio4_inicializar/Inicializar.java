package es.studium.Ejercicio4_inicializar;

public class Inicializar
{

	public static void main(String[] args)
	{
		final int MAX = 3;
		int tabla[]=new int[MAX];
		
		for(int i=0; i<MAX; i++)
		{
			tabla[i]=0;
		}
		for(int i=0; i<MAX; i++)
		{
			System.out.print(tabla[i]+" "); //con print ponemos una cosa al lado de otra y con println debajo de otra.
		}
	}

}
