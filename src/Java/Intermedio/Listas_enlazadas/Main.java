package Java.Intermedio.Listas_enlazadas;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> words = new LinkedList<String>();

        System.out.println("Ingresa 5 palabras:");
        while (words.size() < 5) {
            String word = scanner.nextLine().trim();
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        System.out.println("Palabras con más de 4 letras:");
        for (String palabra : words) {
            if (palabra.length() > 4) {
                System.out.println(palabra);
            }
        }
    }
}
