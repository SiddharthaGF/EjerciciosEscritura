package Ejercicio06;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PrintWriter pw = null;

        int numPersonas;

        System.out.println("¿Cuántas personas desea registrar?");
        numPersonas = scan.nextInt();

        try {
            pw = new PrintWriter("registroCivil.txt");
            for (int i = 1; i <= numPersonas; i++) {
                System.out.println("Ingrese la información de la persona " + i + ":");

                System.out.print("Cédula: ");
                String cedula = scan.next().toUpperCase();

                System.out.print("Nombre: ");
                String nombre = scan.next().toUpperCase();

                System.out.print("Apellido: ");
                String apellido = scan.next().toUpperCase();

                System.out.print("Estado civil: ");
                String estadoCivil = scan.next().toUpperCase();

                System.out.print("Teléfono: ");
                String telefono = scan.next().toUpperCase();

                System.out.print("Género (M/F): ");
                String genero = scan.next().toUpperCase();

                System.out.print("Tipo de sangre: ");
                String tipoSangre = scan.next().toUpperCase();

                System.out.print("Fecha de nacimiento (dd/mm/yyyy): ");
                String fechaNacimiento = scan.next().toUpperCase();

                System.out.print("Edad: ");
                int edad = scan.nextInt();

                pw.println(cedula + ";" + nombre + ";" + apellido + ";" + estadoCivil + ";" + telefono + ";" + genero + ";" + tipoSangre + ";" + fechaNacimiento + ";" + edad);
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al crear el archivo.");
        } finally {
            assert pw != null;
            pw.close();
            scan.close();
        }

        System.out.println("¡Registro exitoso!");


    }
}