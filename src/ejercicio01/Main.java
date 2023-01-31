package ejercicio01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Variable para el número aleatorio
        int numeroAleatorio;
        //Variable para el límite superior de los números aleatorios
        int limiteSuperior = 500;
        //Variable para el límite inferior de los números aleatorios
        int limiteInferior = 5;
        //Variable para el nombre del archivo
        String nombreArchivo = "resultadoEjercicio01.txt";

        //Instanciamos un objeto de la clase Random
        Random aleatorio = new Random();

        //Creamos el archivo donde se almacenarán los números aleatorios
        try {
            FileWriter fw = new FileWriter(nombreArchivo);

            //Generamos 1000 números aleatorios y los guardamos en el archivo
            for (int i = 0; i < 1000; i++) {
                numeroAleatorio = aleatorio.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
                fw.write(String.valueOf(numeroAleatorio) + "\n");
            }

            //Cerramos el archivo
            fw.close();

            //Mensaje de éxito al guardar los números aleatorios en el archivo
            System.out.println("Números aleatorios guardados con éxito en el archivo " + nombreArchivo);

        } catch (IOException e) {
            System.out.println("Error al guardar los números aleatorios en el archivo " + nombreArchivo);
        }

    }
}