package unidad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Programa4 {

    //Metodo que usa como constantes la ruta del archivo datos.txt y el indicador que se usara como referencia
    public void leerTelefonos(){
        final String RUTA = "C:/EjerciciosStreams/datos.txt";
        final String INDICADOR = "Teléfono:";

        try {
            BufferedReader br = new BufferedReader(new FileReader(RUTA));
            Scanner sc = new Scanner(br);

            /*Mientras lea una nueva línea hace un array de palabras en las que busca la que sea igual que
            la constante INDICADOR, posteriormente imprime la palabra del array +1, ya que lo siguiente
            en el documento datos.txt delimitado por \\s+ (espacios) es el número de teléfono
            y lo imprime en consola. Lo he hecho de esta manera, porque el formato es siempre el mismo em el archivo*/
            while (sc.hasNextLine()){
                String[] palabras = sc.nextLine().split("\\s+");
                for (int i = 0; i < palabras.length; i++){
                    if (palabras[i].equals(INDICADOR)) {
                        System.out.println("Número de teléfono: " + palabras[i + 1]);
                    }
                }
            }
            sc.close();
        } catch (IOException e){
            System.out.println("Ha habido un error. " + e.getMessage());
        }
    }
}
