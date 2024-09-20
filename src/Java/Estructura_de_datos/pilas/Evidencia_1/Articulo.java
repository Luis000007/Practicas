package Java.Estructura_de_datos.pilas.Evidencia_1;

public class Articulo {

    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;

    }

    public double getPrecio() {
        return precio;

    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio;

    }
}