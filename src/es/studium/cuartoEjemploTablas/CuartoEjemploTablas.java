package es.studium.cuartoEjemploTablas;

public class CuartoEjemploTablas
{

	public static void main(String[] args)
	{
		String paises[] = {"Portugal","España","Belgica","Ucrania","EEUU"};
		
		for(int i=0; i<paises.length; i++) //este for da resultados,muestra valores,modifica valores...
		{
			System.out.println(paises[i]);
		}
		for(String pais:paises)
		{
			System.out.println(pais); //muestra solamente resultados
		}
				
		
	}

}
