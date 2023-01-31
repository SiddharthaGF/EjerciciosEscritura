package ejercicio05;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        PrintWriter salida = new PrintWriter(new FileWriter("triangulos.txt"));

        // Variables en español
        int base, altura;
        double area;
        char continuar;

        // Inicio del ciclo
        do {
            System.out.println("Ingrese la base del triangulo rectangulo: ");
            base = sc.nextInt();
            System.out.println("Ingrese la altura del triangulo rectangulo: ");
            altura = sc.nextInt();

            // Cálculo del área
            area = (base * altura) / 2;

            // Escritura de la información en el archivo
            salida.println(base + "|" + altura + "|" + area);

            // Pregunta para continuar ingresando triángulos
            System.out.println("Desea ingresar los datos de otro triangulo (S/N)? ");
            continuar = sc.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        // Cierre del archivo
        salida.close();
        System.out.println("Información almacenada en el archivo triangulos.txt");


    }
}