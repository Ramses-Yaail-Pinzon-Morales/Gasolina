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
public class Entrega {
    int NumPedido;
    int ES;
    String FechaEntrega;
    String HoraEntrega;
    String NombreOperador;
    String CantidadEntregada;
    String Tipo;
    String Diferencia;
    String Factura;
    String Nota;
    String Cumplido;
    String numPedido;
    String es;

    public Entrega() {
    }

    public Entrega(int NumPedido, int ES, String FechaEntrega, String HoraEntrega, String NombreOperador, String CantidadEntregada, String Tipo, String Diferencia, String Factura, String Nota, String Cumplido, String numPedido, String es) {
        this.NumPedido = NumPedido;
        this.ES = ES;
        this.FechaEntrega = FechaEntrega;
        this.HoraEntrega = HoraEntrega;
        this.NombreOperador = NombreOperador;
        this.CantidadEntregada = CantidadEntregada;
        this.Tipo = Tipo;
        this.Diferencia = Diferencia;
        this.Factura = Factura;
        this.Nota = Nota;
        this.Cumplido = Cumplido;
        this.numPedido = numPedido;
        this.es = es;
    }

    public int getNumPedido() {
        return NumPedido;
    }

    public void setNumPedido(int NumPedido) {
        this.NumPedido = NumPedido;
    }

    public int getES() {
        return ES;
    }

    public void setES(int ES) {
        this.ES = ES;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getHoraEntrega() {
        return HoraEntrega;
    }

    public void setHoraEntrega(String HoraEntrega) {
        this.HoraEntrega = HoraEntrega;
    }

    public String getNombreOperador() {
        return NombreOperador;
    }

    public void setNombreOperador(String NombreOperador) {
        this.NombreOperador = NombreOperador;
    }

    public String getCantidadEntregada() {
        return CantidadEntregada;
    }

    public void setCantidadEntregada(String CantidadEntregada) {
        this.CantidadEntregada = CantidadEntregada;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDiferencia() {
        return Diferencia;
    }

    public void setDiferencia(String Diferencia) {
        this.Diferencia = Diferencia;
    }

    public String getFactura() {
        return Factura;
    }

    public void setFactura(String Factura) {
        this.Factura = Factura;
    }

    public String getNota() {
        return Nota;
    }

    public void setNota(String Nota) {
        this.Nota = Nota;
    }

    public String getCumplido() {
        return Cumplido;
    }

    public void setCumplido(String Cumplido) {
        this.Cumplido = Cumplido;
    }
    
    public String getnumPedido() {
        return numPedido;
    }
    
    public void setnumPedido(String numPedido) {
        this.numPedido = numPedido;
    }
    
    public String getes (){
        return es;
    }
    
    public void setes (String es){
        this.es = es;
    }
}
