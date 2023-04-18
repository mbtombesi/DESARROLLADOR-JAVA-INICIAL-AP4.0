package PaqueteN1;

public class Clase5_Metodos {
    public static void main(String[] args) {
        
        int listaEdades [] = {12, 23, 40, 78, 5, 34, 44, 25, 56, 60};
        int sumaEdades = suma (listaEdades);
        int promedio = sumaEdades / listaEdades.length;
        System.out.println("Los elementos del vector son: " );
        mostrar(listaEdades);
        System.out.println("\nEl promedio de edades es: " + promedio);

        int lista [] = {12, 23, 40, 78};
        int sumaValores = suma(lista);
        System.out.println("\nEl vector tiene los siguientes elementos: ");
        mostrar(lista);
        System.out.println("\nLa suma es: "+ sumaValores);
        double promedio1 = sumaValores * 1.0 / lista.length;
        System.out.println("El promedio 1 es: " + promedio1);

    }

    public static int suma(int vectorSuma[] ) {
        
        int suma=0;
        for (int indice=0; indice < vectorSuma.length; indice++) {
            suma = suma + vectorSuma [indice];
        }
        return suma;
    }

    public static void mostrar(int vectorMostrar[]) {
        for (int i=0; i < vectorMostrar.length; i++) {
            System.out.println(vectorMostrar [i] + " ");

        }
    }

    

}

    
