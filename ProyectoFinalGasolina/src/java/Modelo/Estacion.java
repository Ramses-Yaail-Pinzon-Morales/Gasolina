/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ShellyOdin21
 */
public class Estacion {

    int Estacion;
    String Correo;
    String Encargado;
    double Telefono;
    String Nombre;
    String NombreEstacion;
    String Direccion;
    String estacion;
    String telefono;
    
    public Estacion() {
    }

    public Estacion(int Estacion, String Correo, String Encargado, double Telefono, String Nombre, String NombreEstacion, String Direccion, String estacion, String telefono) {
        this.Estacion = Estacion;
        this.Correo = Correo;
        this.Encargado = Encargado;
        this.Telefono = Telefono;
        this.Nombre = Nombre;
        this.NombreEstacion = NombreEstacion;
        this.Direccion = Direccion;
        this.estacion = estacion;
        this.telefono = telefono;
    }
    
    public int getEstacion() {
        return Estacion;
    }

    public void setEstacion(int Estacion) {
        this.Estacion = Estacion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public double getTelefono() {
        return Telefono;
    }

    public void setTelefono(double Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreEstacion() {
        return NombreEstacion;
    }

    public void setNombreEstacion(String NombreEstacion) {
        this.NombreEstacion = NombreEstacion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    public String getestacion() {
        return estacion;
    }
    
    public void setestacion(String estacion) {
        this.estacion = estacion;
    }
    
    public String gettelefono() {
        return telefono;
    }
    
    public void settelefono(String telefono){
        this.telefono=telefono;
    }
}
