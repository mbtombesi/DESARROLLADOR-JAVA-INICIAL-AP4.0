package PaqueteN1;

import java.util.Scanner;

public class Clase6_IngresarDatos_por_consola {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese 4 nombres separados por \";\": ");

        String nombre = datos.nextLine();	

		/*System.out.print("Ingrese 4 numeros separados por \" \": ");

		int  vector[] = new int[3];

		vector[0]= datos.nextInt();	

		vector[1]= datos.nextInt();

		vector[2]= datos.nextInt();

		

		for (int i=0; i<vector.length; i++) {

			System.out.println(vector[i]);

		

		}*/

        System.out.println("Los datos ingresados son: "+ nombre);

		datos.close();

 

	}
    
}
