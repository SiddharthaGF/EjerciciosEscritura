package ejercicio02;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String respuesta, nombre;
        FileWriter archivo = null;
        PrintWriter escritor = null;

        try {
            // Crear un archivo para almacenar nombres
            archivo = new FileWriter("resultadosEjercicio02.txt");
            escritor = new PrintWriter(archivo);

            // Solicitar y almacenar nombres
            do {
                System.out.print("Ingrese un nombre: ");
                nombre = lector.nextLine().toLowerCase();
                escritor.println(nombre);

                System.out.print("¿Desea ingresar otro nombre? (si/no): ");
                respuesta = lector.nextLine();
            } while (respuesta.equals("si"));
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo");
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
                if (archivo != null) {
                    archivo.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo");
            }
        }

    }
}