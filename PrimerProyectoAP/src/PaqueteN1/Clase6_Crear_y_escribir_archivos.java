package PaqueteN1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Clase6_Crear_y_escribir_archivos {
    
    public static void main(String[] args) {
        
        Path ruta = Paths.get("E:/PROGRAMACION/ARGENTINA PROGRAMA JAVA/Ejercicios/PrimerProyectoAP/algo.txt");
        try {
            Files.write (ruta, "Lucrecia Rossi; Hernandez Nelida; Angela Camacho; Juan Perez".getBytes());
            List < String > ContenidoArchivo = Files.readAllLines (ruta, StandardCharsets.UTF_8);
            ContenidoArchivo.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Error en el archivo");
        }
        

    }
}
