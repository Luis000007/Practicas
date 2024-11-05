package Java.Estructura_de_datos.pilas.Act_9_;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static List<Persona> generarPersonas() {
        List<Persona> listaPersonas = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String nombre = "Persona" + (i + 1);
            int edad = random.nextInt(50) + 20;  // Genera edades entre 20 y 70
            double estatura = 1.5 + random.nextDouble(); // Estaturas entre 1.5 y 2.5 metros

            listaPersonas.add(new Persona(nombre, edad, estatura));
        }

        return listaPersonas;
    }

    public static void main(String[] args) {
        List<Persona> listaOriginal = generarPersonas();

        System.out.println("Lista original:");
        for (Persona persona : listaOriginal) {
            System.out.println(persona);
        }
    }
}
