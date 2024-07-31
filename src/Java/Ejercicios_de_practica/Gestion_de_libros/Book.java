package Java.Ejercicios_de_practica.Gestion_de_libros;

public class Book {

    String Titilo;
    String Autor;
    double Precio;
    int Publicado;

    public Book (String Titulo, String Autor, double Precio, int Publicado) {

        this.Titilo = Titulo;
        this.Autor = Autor;
        this.Precio = Precio;
        this.Publicado = Publicado;

    }
    // Getters
    public String getTitilo() {
        return Titilo;
    }

    public String getAutor() {
        return Autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getPublicado() {
        return Publicado;
    }
    // Setters
    public void setTitilo(String Titilo) {
        this.Titilo = Titilo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setPublicado(int Publicado) {
        this.Publicado = Publicado;
    }

    // Método para imprimir la información del libro
    public void BooksInfo() {

        System.out.println("Titulo: " + Titilo);
        System.out.println("Autor: " + Autor);
        System.out.println("Precio: " + Precio);
        System.out.println("Publicado: " + Publicado);
        System.out.println();

    }
}
