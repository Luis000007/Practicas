package Java.Estructura_de_datos.pilas.Act_9_;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;

    // Constructor que redondea la estatura a dos decimales
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = Math.round(estatura * 100.0) / 100.0; // Redondea a dos decimales
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = Math.round(estatura * 100.0) / 100.0; // Redondea a dos decimales
    }

    // Método toString con dos decimales para estatura
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estatura=" + String.format("%.2f", estatura) + // Formato de dos decimales
                '}';
    }
}
