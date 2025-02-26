package unidad5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Programa3 {

    //Metodo para insertar el área calculada en dos.java
    public void calcularAreaTriangulo() {
        final String ARCHIVO = "C:/EjerciciosStreams/dos.java"; //Constante ya que no se modifica
        double base;
        double altura;
        Scanner consola = new Scanner(System.in);


        System.out.println("Vamos a calcular el Área de un triángulo.");
        System.out.print("Inserta la base (cm): ");
        base = consola.nextDouble();
        System.out.print("Inserta la altura (cm): ");
        altura = consola.nextDouble();
        double area = (base * altura)/2;
        String resultado = ("El área es: " + area + " cm²");
        System.out.println(resultado + " y se procede a guardar la información en dos.java");

        //Tras calcular el área se escribre en el archivo de la constante la variable resultado
        try (FileWriter fw = new FileWriter(ARCHIVO)){
            fw.write(resultado);
            System.out.println("Guardado correctamente");
        } catch (IOException e){
            System.out.println("Ha habido un error. " + e.getMessage());
        }
    }
}
