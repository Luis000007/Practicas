package Java.Estructura_de_datos.pilas.Act_9_;

import java.util.List;

public class Ordenamiento {
    public static void burbuja(List<Persona> lista, String atributo) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparar(lista.get(j), lista.get(j + 1), atributo) > 0) {
                    Persona temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public static void seleccion(List<Persona> lista, String atributo) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (comparar(lista.get(j), lista.get(minIdx), atributo) < 0) {
                    minIdx = j;
                }
            }
            Persona temp = lista.get(minIdx);
            lista.set(minIdx, lista.get(i));
            lista.set(i, temp);
        }
    }

    private static int comparar(Persona p1, Persona p2, String atributo) {
        switch (atributo) {
            case "nombre":
                return p1.getNombre().compareTo(p2.getNombre());
            case "edad":
                return Integer.compare(p1.getEdad(), p2.getEdad());
            case "estatura":
                return Double.compare(p1.getEstatura(), p2.getEstatura());
            default:
                throw new IllegalArgumentException("Atributo inválido: " + atributo);
        }
    }
}
