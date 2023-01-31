package ejercicio04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        PrintWriter salida = null;

        try {
            salida = new PrintWriter("factura.txt");

            for (int i = 1; i <= 10; i++) {
                System.out.println("Ingrese el nombre del producto " + i + ":");
                String nombreProducto = entrada.nextLine();

                System.out.println("Ingrese la cantidad " + i + ":");
                int cantidad = entrada.nextInt();

                System.out.println("Ingrese el precio " + i + ":");
                int precio = entrada.nextInt();

                int total = cantidad * precio;
                salida.println(nombreProducto + "-" + cantidad + "-" + precio + "-" + total);

                entrada.nextLine();
            }
        } catch (Exception ex) {
            System.out.println("Error al escribir en el archivo: " + ex.getMessage());
        } finally {
            if (salida != null) {
                salida.close();
            }
        }

        System.out.println("Información guardada en el archivo factura.txt");
    }

}
