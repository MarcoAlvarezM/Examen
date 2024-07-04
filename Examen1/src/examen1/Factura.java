/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Factura {

    //Declaracion de variables
    public String nombre;
    public int cedula;
    public int codigo;
    public double monto;
    public int mes;
    public int indicador;

    //Constructores
    public Factura(String nombre, int cedula, int codigo, double monto, int mes, int indicador) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.monto = monto;
        this.mes = mes;
        this.indicador = indicador;
    }

    Factura() {
        
    }

    public void monto() {

    }

    //Indicacion de mes
    public int mes() {

        int mes = Integer.parseInt(JOptionPane.showMessageDialog(null, "Digite el mes que desea ingresar: "));
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

    //Calcular datos
    public int Clasificacion() {
        int indicador = 0;
        int contador = 0;
        double bono=0;
        contador = Integer.parseInt(JOptionPane.showInputDialog("La factura contiene productos electronicos si=1, no=0"));

        if (indicador == 1) {
            
        } else if (indicador == 2) {
            
        }else if (indicador ==3)
                
                bono=(monto*0.10)+monto;
                
        }
        
 

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getIndicador() {
        return indicador;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;

    }

}
