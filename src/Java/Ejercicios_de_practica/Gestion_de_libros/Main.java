package Java.Ejercicios_de_practica.Gestion_de_libros;

public class Main {
    public static void main(String[] args) {

        // Crear objetos de la clase Book
        Book book1 = new Book("El principe", "Niccolò Machiavelli", 13.95, 1532);
        Book book2 = new Book("El monje que vendió su Ferrari", "Robin Sharma", 12.99, 1999);
        Book book3 = new Book("The Way of the Superior Man", "David Deida", 15.95, 1997);

        book1.BooksInfo();
        book2.BooksInfo();
        book3.BooksInfo();
    }
}
