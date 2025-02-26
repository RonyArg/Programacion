package unidad5;

import java.io.FileWriter;
import java.io.IOException;


public class Programa2 {


    /*Metodo para insertar los números en el archivo uno.java usando un for con un array para no tener
    que escribir todos los números uno por uno y otro for para crear un bucle que inserte los datos
    es lo más simplificado para poder escalar el código de manera sencilla*/
    public void insertarNumeros() {

        //constante con el directorio, ya que no se va a modificar
        final String ARCHIVO = "C:/EjerciciosStreams/uno.java";
        int[] numeros = new int[11];
        for (int i = 0; i <= 10; i++) {
            numeros[i] = i;
        }
        try (FileWriter fw = new FileWriter(ARCHIVO)) {
            for (int num : numeros)
                fw.write(num + "\n");
            fw.close();
            System.out.println("Se han insertado los datos correctamente");
        } catch (IOException e) {
            System.out.println("Ha habido un error, es posible que tengas que intentar la opción 1 primero. "
                    + e.getMessage());
        }
    }
}
