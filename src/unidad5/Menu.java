package unidad5;

import java.util.Scanner;


public class Menu {

    Programa1 programa1 = new Programa1();
    Programa2 programa2 = new Programa2();
    Programa3 programa3 = new Programa3();
    Programa4 programa4 = new Programa4();
    Programa5 programa5 = new Programa5();


    public void iniciarMenu() {
        Scanner consola = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("""
                   \n----------Lista de programas a ejecutar----------
                   \t1.Crear directorio y archivos .java
                   \t2.Crear números 00-10 en "uno.java"
                   \t3.Calcular el área de un triángulo e insertarlo en "dos.java"
                   \t4.Leer teléfonos de "datos.txt"
                   \t5.Crear acceso aleatorio de "datos.txt"
                   \t6.Salir""");
            int eleccion = consola.nextInt();
            switch (eleccion) {
                case 1 -> {
                    programa1.crearDirectorio();
                    programa1.crearArchivos();
                }
                case 2 -> programa2.insertarNumeros();
                case 3 -> programa3.calcularAreaTriangulo();
                case 4 -> programa4.leerTelefonos();
                case 5 -> programa5.crearAccesoAleatorio();
                case 6 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }
                default -> System.out.println("Opción incorrecta. Introduce un número entre 1-6.");
            }
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciarMenu();
    }
}
