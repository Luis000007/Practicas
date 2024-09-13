package Java.Estructura_de_datos.pilas.UnifilaBancaria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Opciones opcioness = new Opciones();

        RegistroPersonas registro = new RegistroPersonas();
        registro.registrarPersona();

        String[] opciones = {"Apertura de cuentas", "Servicios de ventanilla (pagos depósitos y retiros)", "Atención de ejecutivo", "Salir"};

        int seleccion;

        do {
            seleccion = JOptionPane.showOptionDialog(null, "Selecciona una opción: ", "Menu de opciónes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Apertura de cuentas");
                    opcioness.aperturaCuenta();
                    break;

                case 1:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Servicios de ventanilla (pagos depósitos y retiros)");
                    opcioness.serviciosVentanilla();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Has seleccionado Atención de ejecutivo");
                    opcioness.atencionEjecutivo();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Has decidido salir");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "No se selecciono ninguna opción");
                    break;
            }
        } while (seleccion != 3);

        JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
    }
}