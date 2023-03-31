package PaqueteN1;

public class Clase4_String_Operaciones {
    public static void main(String[] args) {
        /*String texto1 = "buenos dias";
        String texto2 = "hasta luego";
        

        boolean tx_iguales = texto1.equals(texto2);
        System.out.println("texto1 es igual a texto2? " + tx_iguales );
        //esto podriamos utilizarlo cuando tengo que loguearme en una pagina. Utilizo esta propiedad para validar si el texto ingresado (contraseña) es igual a la contraseña correcta

        //concatenar 
        String texto3 = texto1 + " " + texto2; 
        System.out.println(texto3);

        //mayuscula y minuscula
        String texto4 = texto1.toLowerCase() + " " + texto2.toUpperCase();
        System.out.println(texto4);

        //replace
        String texto5 = texto1.replace("os dias", "as tardes");
        System.out.println(texto5);

        //contains
        boolean texto6 = texto2.contains ("has");
        System.out.println(texto6);

        boolean texto7 = texto5.endsWith("des");
        System.out.println(texto7);*/

        String palabra="Mas Apapachar menos criticar";
        int contador=0, posicion=0; // en la definicion de string dice que es como si tuviesemos un array de caracteres
        char caracter = 'a';

        String palabra_minu=palabra.toLowerCase(); // para que no distinga entre mayuscula y minuscula, y que me devuelva la cantidad de caracteres correcta sin distinguir, lo primero que hago es convertir la palabra a minuscula (porque el caracter que le pido que busque esta en minuscula)

        //a la variable posicion que es de tipo int le va a devolver el indice (la posicion) de donde comienza
        posicion = palabra_minu.indexOf(caracter);

        while (posicion != -1) {
            contador++;
            posicion = palabra_minu.indexOf(caracter,posicion+1);
            System.out.println("Posicion: " +posicion+" " );

        }

        System.out.println("La cantidad de coincidencias es: " + contador);

        /*FUNCION PARA ELIMINAR TILDES (ver ejemplo en chat gpt)
        public static String eliminarTildes(String cadena) {
            String cadena, cadenaSinTildes = cadena
                .replaceAll("á", "a")
                .replaceAll("é", "e")
                .replaceAll("í", "i")
                .replaceAll("ó", "o")
                .replaceAll("ú", "u");
            return cadenaSinTildes;
        }*/

    
    //dividir oraciones con split
    String frase = "Alberto Monica Elias Belen"; // tengo una variable de tipo string que se llama "frase"
    String fraseSplit [] = frase.split (" "); // declaro un vector de tipo string y uso la funcion frase.split (" -espacio- ") esto hace que la frase se corte donde hay un espacio 

    for (String elemento : fraseSplit) { // hago el for each para mostrar el vector
        System.out.println(elemento);
    }

    String frase2 = "Alberto; Monica; Elias; Belen;"; 
    String fraseSplit2 [] = frase.split (";"); // uso la funcion frase.split (";") para que la frase se corte donde hay punto y coma 

    for (String elemento : fraseSplit) { // hago el for each para mostrar el vector
        System.out.println(elemento);
    }
        

    }


    



}
