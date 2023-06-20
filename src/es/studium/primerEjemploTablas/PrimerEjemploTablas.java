package es.studium.primerEjemploTablas;

public class PrimerEjemploTablas
{

	public static void main(String[] args)
	{
		int tabla[]; //Definida, sin tamaño ni contenido
		int tabla2[] = new int[10]; //Definida, con tamaño y sin contenido.
		int tabla3[] = {1, 3, 5, 7, 11}; //Definida, con tamaño y contenido
		
		tabla2[0] = 1;
		tabla2[9] = 88;
		//tabla2 [10] = 23; (DARIA FALLO YA QUE 10 POSICIONES SERIAN DEL 0 AL 9)
		
		System.out.println(tabla2[0]);
		System.out.println(tabla2[5]);
		System.out.println(tabla2[9]);
		
		//La posicion sexta o [5] de la tabla2, da 0 por defecto ya que no hemos citado que valor tiene.
		
	}

}
