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
public class Factura {
    int Operacion;
    String Fecha;
    String litros;
    String Comision;
    String Importe;
    String IVA;
    String Total;
    String FechaPago;
    String ComDesp;
    String MontoRepartir;
    String MontoIndividual;

    public Factura() {
    }

    public Factura(int Operacion, String Fecha, String litros, String Comision, String Importe, String IVA, String Total, String FechaPago, String ComDesp, String MontoRepartir, String MontoIndividual) {
        this.Operacion = Operacion;
        this.Fecha = Fecha;
        this.litros = litros;
        this.Comision = Comision;
        this.Importe = Importe;
        this.IVA = IVA;
        this.Total = Total;
        this.FechaPago = FechaPago;
        this.ComDesp = ComDesp;
        this.MontoRepartir = MontoRepartir;
        this.MontoIndividual = MontoIndividual;
    }

    public int getOperacion() {
        return Operacion;
    }

    public void setOperacion(int Operacion) {
        this.Operacion = Operacion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public String getlitros() {
        return litros;
    }
    
    public void setlitros(String litros) {
        this.litros = litros;
    }
    
    public String getComision() {
        return Comision;
    }

    public void setComision(String Comision) {
        this.Comision = Comision;
    }

    public String getImporte() {
        return Importe;
    }

    public void setImporte(String Importe) {
        this.Importe = Importe;
    }

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(String FechaPago) {
        this.FechaPago = FechaPago;
    }

    public String getComDesp() {
        return ComDesp;
    }

    public void setComDesp(String ComDesp) {
        this.ComDesp = ComDesp;
    }

    public String getMontoRepartir() {
        return MontoRepartir;
    }

    public void setMontoRepartir(String MontoRepartir) {
        this.MontoRepartir = MontoRepartir;
    }

    public String getMontoIndividual() {
        return MontoIndividual;
    }

    public void setMontoIndividual(String MontoIndividual) {
        this.MontoIndividual = MontoIndividual;
    }
    
        
}
