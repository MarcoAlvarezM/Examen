/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Factura {

    //Declaracion variable
    public String nombre_c;
    public String cedula;
    public double monto;
    public String codigo_F;
    public int mes;
    public int productos_E;
    public int productos_A;
    public int productos_C;

    //Constructores
    public Factura(String nombre_c, String cedula, double monto, String codigo_F, int mes, int productos_E, int productos_A, int productos_C) {
        this.nombre_c = nombre_c;
        this.cedula = cedula;
        this.monto = monto;
        this.codigo_F = codigo_F;
        this.mes = mes;
        this.productos_E = productos_E;
        this.productos_A = productos_A;
        this.productos_C = productos_C;
    }

    Factura() {

    }

    //Calculo de datos 
    public int monto() {
        int indicador = 0;
        int contador = 0;
        double bono = 0;
        contador = Integer.parseInt(JOptionPane.showInputDialog(""));

        if (indicador == 1) {

        } else if (indicador == 2) {

        } else if (indicador == 3) {
            bono = (monto * 0.10) + monto;
        }
        return 0;
    }

    //Indicacion de mes
    public int mes() {

        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Enero");
            case 2:
                JOptionPane.showMessageDialog(null, "Febrero");
            case 3:
                JOptionPane.showMessageDialog(null, "Marzo");
            case 4:
                JOptionPane.showMessageDialog(null, "Abril");
            case 5:
                JOptionPane.showMessageDialog(null, "Junio");
            case 6:
                JOptionPane.showMessageDialog(null, "Julio");
            case 7:
                JOptionPane.showMessageDialog(null, "Agosto");
            case 8:
                JOptionPane.showMessageDialog(null, "Septiembre");
            case 9:
                JOptionPane.showMessageDialog(null, "Octubre");
            case 10:
                JOptionPane.showMessageDialog(null, "Agosto");
            case 11:
                JOptionPane.showMessageDialog(null, "Noviembre");
            case 12:
                JOptionPane.showMessageDialog(null, "Diciembre");

        }
        return this.mes = mes;

    }

    //Setter y Getters
    public String getNombre_c() {
        return nombre_c;
    }

    public void setNombre_c(String nombre_c) {
        this.nombre_c = nombre_c;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCodigo_F() {
        return codigo_F;
    }

    public void setCodigo_F(String codigo_F) {
        this.codigo_F = codigo_F;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getProductos_E() {
        return productos_E;
    }

    public void setProductos_E(int productos_E) {
        this.productos_E = productos_E;
    }

    public int getProductos_A() {
        return productos_A;
    }

    public void setProductos_A(int productos_A) {
        this.productos_A = productos_A;
    }

    public int getProductos_C() {
        return productos_C;
    }

    public void setProductos_C(int productos_C) {
        this.productos_C = productos_C;
    }

}
