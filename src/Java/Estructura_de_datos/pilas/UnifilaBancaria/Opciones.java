package Java.Estructura_de_datos.pilas.UnifilaBancaria;

import javax.swing.JOptionPane;

public class Opciones {

    // Método para la Apertura de cuentas
    public void aperturaCuenta() {
        String nombreCuenta = JOptionPane.showInputDialog(null, "Introduce el nombre del titular de la cuenta:", "Apertura de Cuenta", JOptionPane.QUESTION_MESSAGE);
        if (nombreCuenta != null && !nombreCuenta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cuenta abierta exitosamente a nombre de: " + nombreCuenta, "Apertura de Cuenta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo abrir la cuenta. El nombre es inválido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para Servicios de ventanilla (pagos, depósitos, retiros)
    public void serviciosVentanilla() {
        String[] operaciones = {"Depósito", "Retiro", "Pago"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una operación:", "Servicios de Ventanilla", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operaciones, operaciones[0]);

        switch (seleccion) {
            case 0 -> {
                String deposito = JOptionPane.showInputDialog(null, "Ingrese la cantidad a depositar:", "Depósito", JOptionPane.QUESTION_MESSAGE);
                if (deposito != null) {
                    JOptionPane.showMessageDialog(null, "Has depositado: $" + deposito, "Depósito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            case 1 -> {
                String retiro = JOptionPane.showInputDialog(null, "Ingrese la cantidad a retirar:", "Retiro", JOptionPane.QUESTION_MESSAGE);
                if (retiro != null) {
                    JOptionPane.showMessageDialog(null, "Has retirado: $" + retiro, "Retiro", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            case 2 -> {
                String pago = JOptionPane.showInputDialog(null, "Ingrese el monto del pago:", "Pago", JOptionPane.QUESTION_MESSAGE);
                if (pago != null) {
                    JOptionPane.showMessageDialog(null, "Has realizado un pago de: $" + pago, "Pago", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            default -> JOptionPane.showMessageDialog(null, "Operación cancelada", "Cancelar", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Método para Atención de ejecutivo
    public void atencionEjecutivo() {
        String motivoConsulta = JOptionPane.showInputDialog(null, "Describa el motivo de su consulta:", "Atención de Ejecutivo", JOptionPane.QUESTION_MESSAGE);
        if (motivoConsulta != null && !motivoConsulta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Un ejecutivo se pondrá en contacto con usted para atender su solicitud sobre: " + motivoConsulta, "Atención de Ejecutivo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Consulta no registrada. Por favor, ingrese un motivo válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
