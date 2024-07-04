/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Solicitar cantidad de facturas
        int cantidad_facturas = 0;
        //Importa clase
        Factura facturai = new Factura();
        cantidad_facturas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de facturas que desee ingresar: "));
        //Solicitar informacion
        for (int i = 0; i < cantidad_facturas; i++) {
            facturai.nombre = JOptionPane.showInputDialog(null, "Digite el nombre del cliente: ");
            facturai.cedula = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cedula del cliente: "));
            facturai.codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo de la factura: "));
            facturai.monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el monto: "));
            facturai.mes = Integer.parseInt(JOptionPane.showInputDialog("Indique el mes: "));
            facturai.indicador = Integer.parseInt(JOptionPane.showInputDialog("Su prodcuto tiene productos electricos: (0=no, 1=si)"));
            //Calculo de datos y calificacion de facturas

            JOptionPane.showMessageDialog(null, "Vendio un total de: ");
            JOptionPane.showMessageDialog(null, "Obtuvo un total en comisiones: ");
            JOptionPane.showMessageDialog(null, "Vendio un total de ");
            JOptionPane.showMessageDialog(null, "Puntos obtenidos por el vendedor: ");

        }

    }

        
            
    
}
