package unidad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Programa5 {

    //Metodo para crear archivo en binario y usar la clase RandomAccessFile
    public void crearAccesoAleatorio () {
        //Constantes ya que no se modifican sus valores
         final String ARCHIVO_INCIAL = "C:/EjerciciosStreams/datos.txt";
         final String NUEVO_ARCHIVO = "C:/EjerciciosStreams/datos.dat";

         /*Procedemos primero a leer datos.txt y en while se usa la clase RandomAccessFile para escribir en binario
           en el nuevo archivo .dat*/
         try {
             BufferedReader bf = new BufferedReader(new FileReader(ARCHIVO_INCIAL));
             RandomAccessFile raf = new RandomAccessFile(NUEVO_ARCHIVO, "rw");
             String linea;
             //cuando no hay más líneas que leer por readline devuelve null y se cierra el while
             while((linea = bf.readLine()) !=null){
                 raf.writeUTF(linea);
             }
             System.out.println("El acceso aleatorio ha sido creado con éxito");
             bf.close();
         } catch (IOException e) {
             System.out.println("Ha habido un error. " + e.getMessage());
         }
    }
}
