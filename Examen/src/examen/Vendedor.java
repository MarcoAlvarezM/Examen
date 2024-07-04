/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Marco
 */
public class Vendedor {

    //Decñaracion de varaibles
    public String nombre;
    public String codigo;
    public String sucursal;
    public String Vehiculo;

    //Constructor
    public Vendedor(String nombre, String codigo, String sucursal) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.Vehiculo = Vehiculo;
        
        
        //Setter y Getters
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(String Vehiculo) {
        this.Vehiculo = Vehiculo;
    }

}
