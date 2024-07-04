/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int cantidad_facturas = 0;
        //Importa clase
        Vendedor vendedori = new Vendedor("Juanito Chacon", 14422, "Heredia", Vehiculo);
        Factura facturai = new Factura();
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        String cedula = JOptionPane.showInputDialog(null, "Digite su cedula: ");
        String codigo = JOptionPane.showInputDialog(null, "Digite su codigo: ");
        String sucursal = JOptionPane.showInputDialog(null, "Ingrese la sucursal: ");

        //Solicitar informacion
        for (int i = 0; i < cantidad_facturas; i++) {
            facturai.nombre_c = JOptionPane.showInputDialog(null, "Digite el nombre del cliente: ");
            facturai.cedula = JOptionPane.showInputDialog(null, "Digite la cedula del cliente: ");
            facturai.codigo_F = JOptionPane.showInputDialog(null, "Digite el codigo de la factura: ");
            facturai.monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el monto: "));
            facturai.mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el mes: "));

        }

        // Impresión de los resultados
        JOptionPane.showMessageDialog(null, "El Agente Vendedor" + nombre + " codigo: " + codigo + " en el mes...");
        JOptionPane.showMessageDialog(null, "Vendio un total de: ");
        JOptionPane.showMessageDialog(null, "Obtuvo un total en comisiones: ");
        JOptionPane.showMessageDialog(null, "Vendio un total de ");
        JOptionPane.showMessageDialog(null, "Puntos obtenidos por el vendedor: ");
    }
}
