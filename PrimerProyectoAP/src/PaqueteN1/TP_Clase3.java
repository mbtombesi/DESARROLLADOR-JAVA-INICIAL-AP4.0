package PaqueteN1;

public class TP_Clase3 {

    public static void main(String[] args) {

    //1)a.
    String palabra = "Otorrinonaringologo";
    int contador = 0, posicion = 0;
    char letra = 'o';

    String palabra_minu = palabra.toLowerCase();
    posicion = palabra_minu.indexOf(letra);

    while (posicion != -1) {
        contador++;
        posicion = palabra_minu.indexOf(letra, posicion + 1);
        //System.out.println("Posicion: " +posicion+" " );
    }

        
    System.out.println("1)a. La letra 'o' aparece " + contador + " veces en la palabra 'Otorrinonaringologo'");

    
    //1)b. Dados tres numeros y un orden (ascendente o descendente) que ordene los numeros y los retorne en un vector de 3
    
    int numeros [] = {7, 2, 9};

    
    System.out.println("1)b. El orden ascendente de los números es: ");

    if (numeros[0] > numeros [1]) {
        if (numeros [1] > numeros [2]){
            System.out.println(numeros[0]);
            System.out.println(numeros[1]);
            System.out.println(numeros[2]);
        } else {
            if (numeros[0] > numeros[2]) {
                if (numeros[2] > numeros[1]) {
                System.out.println(numeros[0]);
                System.out.println(numeros[2]);
                System.out.println(numeros[1]);
                }
            }
        }
    };
    
    if (numeros[1] > numeros[0]) {
        if (numeros[0] > numeros[2]){
            System.out.println(numeros[1]);
            System.out.println(numeros[0]);
            System.out.println(numeros[2]);
        } else {
            if (numeros[1] > numeros[2]) {
                if (numeros[2] > numeros[0]) {
                System.out.println(numeros[1]);
                System.out.println(numeros[2]);
                System.out.println(numeros[0]);
                }
            }
        }
    };

    if (numeros[2] > numeros[0]) {
        if (numeros[0] > numeros[1]){
            System.out.println(numeros[2]);
            System.out.println(numeros[0]);
            System.out.println(numeros[1]);
        } else {
            if (numeros[2] > numeros[1]) {
                if (numeros[1] > numeros[0]) {
                System.out.println(numeros[2]);
                System.out.println(numeros[1]);
                System.out.println(numeros[0]);
                }
            }
        }
    };

    System.out.println("COMO HAGO PARA QUE LOS RETORNE EN UN VECTOR??");

    
    //1)c. Dado un vector de numeros, y un numero X, que sume todos los numeros > X y retorne el resultado

    int vectorDeNumeros [] = {3,66,24,7,94,29,150};
    

    for (int Numero : vectorDeNumeros){
        

        //System.out.println(Numero);
    }

    int suma = 0;
    int x = 24;

    for (int i = 0; i < vectorDeNumeros.length; i++) {

        if (vectorDeNumeros[i] > x)

        suma += vectorDeNumeros[i];

    }

    System.out.println("1)c. La suma de los numeros mayores a x es " + suma);



    //2) Genere una clase, utilice el metodo split para separar una lista de 10 nombres tomados de una variable, y luego muestre por consola el resultado.
    
    System.out.println("2)");
    String frase = "Alberto Monica Elias Belen Mercedes Norma Jesica Marcos Lautaro Julian"; // tengo una variable de tipo string que se llama "frase"
    String fraseSplit [] = frase.split (" "); // declaro un vector de tipo string y uso la funcion frase.split (" -espacio- ") esto hace que la frase se corte donde hay un espacio 

    for (String elemento : fraseSplit) { // hago el for each para mostrar el vector
        
        System.out.println (elemento);
    }
    
    }


}


    