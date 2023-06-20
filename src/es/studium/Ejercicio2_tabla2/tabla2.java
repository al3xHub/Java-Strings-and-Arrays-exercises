package es.studium.Ejercicio2_tabla2;

public class tabla2
{

	public static void main(String[] args)
	{
		int pares[] = new int[20]; // 20 posiciones
		
		for(int i=0; i<pares.length; i++) //bucle i se repetira 20 veces
		{
			pares[i]= i*2; //tomare i y lo multiplicara por 2
		}
		
		for(int i=0; i<pares.length; i++) // bucle que se repetira 20 veces
		{
			System.out.println(pares[i]); // mostrara por pantalla las 20 veces que i se ha multiplicado por 2
		}
		
		
		
		
		
		
		
	}

}
