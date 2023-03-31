package PaqueteN1;

public class TP_Clase3 {

    public static void main(String[] args) {

    
    String palabra = "Otorrinonaringologo";
    int contador = 0, posicion = 0;
    char letra = 'o';

    String palabra_minu = palabra.toLowerCase();
    posicion = palabra_minu.indexOf(letra);

    while (posicion != -1) {
        contador++;
        posicion = palabra_minu.indexOf(letra, posicion + 1);
        System.out.println("Posicion: " +posicion+" " );
    }

        
    System.out.println("La letra 'o' aparece " + contador + " veces en la palabra 'Otorrinonaringologo'");

    

    /* 
    int[] numeros = { 7, 2, 9 }; 
    String orden = "asc"; 
    int[] numerosOrdenados = ordenarNumeros(numeros, orden);
    System.out.println("Numeros ordenados: " + Arrays.toString(numerosOrdenados));*/


    int []vector3 = {4,76,89,10,6};
    int x=50, suma=0;

    System.out.println();
    System.out.println("Segundo vector:");

    for (int indice1=0; indice1 < vector3.length; indice1++) {
        if(vector3 [indice1] > x) {
            suma = suma + vector3[indice1];
        }
    }
    System.out.println("La suma es: " + suma);


    //Inciso 2)
    String frase = "Alberto Monica Elias Belen Nadia Oscar Luis Norma Mario Marcos"; 
    String fraseSplit [] = frase.split (" "); 

    for (String elemento : fraseSplit) { 
        System.out.println(elemento);
    }

    



}

}
    