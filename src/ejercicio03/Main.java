package ejercicio03;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        FileWriter escribir;

        // Pedir el número de alumnos
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = leer.nextInt();

        // Arreglo para almacenar el nombre de los alumnos
        String[] nombres = new String[numAlumnos];
        // Arreglo para almacenar las notas del primer y segundo parcial
        double[][] notas = new double[numAlumnos][2];

        // Pedir la información de cada alumno
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            leer.next();
            nombres[i] = leer.nextLine();
            System.out.print("Ingrese la nota del primer parcial del alumno " + nombres[i] + ": ");
            notas[i][0] = leer.nextDouble();
            System.out.print("Ingrese la nota del segundo parcial del alumno " + nombres[i] + ": ");
            notas[i][1] = leer.nextDouble();
        }

        // Calcular el promedio de cada alumno
        double[] promedios = new double[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            promedios[i] = (notas[i][0] + notas[i][1]) / 2;
        }

        try {
            // Abrir el archivo para escribir la información
            escribir = new FileWriter("alumnos.txt");

            // Escribir la información de cada alumno
            for (int i = 0; i < numAlumnos; i++) {
                escribir.write(nombres[i] + ";" + notas[i][0] + ";" + notas[i][1] + ";" + promedios[i] + "\n");
            }

            // Cerrar el archivo
            escribir.close();
            System.out.println("Información guardada exitosamente en el archivo alumnos.txt");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo alumnos.txt");
        }


    }
}