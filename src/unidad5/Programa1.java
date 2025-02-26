package unidad5;

import java.io.File;
import java.io.IOException;


public class Programa1 {
    //Se establecen las variables del directorio que vamos a crear y el nombre de los archivos usando un array
    String carpeta = "C:/EjerciciosStreams";
    String[] archivos = {"uno.java", "dos.java"};


    //Metodo para crear la carpeta usando la variable "carpeta"
    public void crearDirectorio() {
        File directorio = new File(carpeta);
        if (directorio.exists())
            System.out.println("El directorio ya existe");
        else if(directorio.mkdir())
            System.out.println("La carpeta se creo con exito. " + directorio.getAbsolutePath());
        else
            System.out.println("Error al crear el directorio. ¡Revisar permisos!");
    }


    //Metodo para crear los archivos uno.java y dos.java usando for para simplificar el código
    public void crearArchivos(){
        for (String nombreArchivo : archivos) {
            File archivo = new File(carpeta, nombreArchivo);
            try {
                if (archivo.createNewFile())
                    System.out.println("Archivo creado en: " + archivo.getAbsolutePath());
                else
                    System.out.println("El archivo ya existe");
            } catch (IOException e) {
                System.out.println("Ha habido un error. " + e.getMessage());
            }
        }
    }
}
