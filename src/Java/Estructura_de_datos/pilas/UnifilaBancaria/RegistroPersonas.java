package Java.Estructura_de_datos.pilas.UnifilaBancaria;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class RegistroPersonas {

    private Queue<String> colaPersonas = new LinkedList<>();

    public void registrarPersona() {

        String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre: ");

        colaPersonas.add(nombre);

        JOptionPane.showMessageDialog(null,nombre + " has sido registrado en la fila.");
    }

    public void mostrarCola() {
        if (!colaPersonas.isEmpty()) {
            StringBuilder personasEnCola = new StringBuilder("Personas en la fila:");

            for (String persona : colaPersonas) {
                personasEnCola.append(persona).append("/n");
            }

            JOptionPane.showMessageDialog(null, personasEnCola.toString());

        } else {
            JOptionPane.showMessageDialog(null, "No hay personas en la fila");
        }
    }
}