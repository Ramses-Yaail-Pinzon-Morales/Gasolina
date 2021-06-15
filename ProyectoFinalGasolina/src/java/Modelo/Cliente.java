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
public class Cliente {

    int NumPedido;
    int ES;
    String FechaProgramada;
    String HoraProgramada;
    int CantidadSolicitada;
    String Tipo;
    String PersonaRequiere;
    String PersonaAutoriza;
    String Entregado;
    String numPedido;
    String es;
    String cantidadSolicitada;
    
    public Cliente() {
    }

    public Cliente(int NumPedido, int ES, String FechaProgramada, String HoraProgramada, int CantidadSolicitada, String Tipo, String PersonaRequiere, String PersonaAutoriza, String Entregado, String numPedido, String es, String cantidadSolicitada) {
        this.NumPedido = NumPedido;
        this.ES = ES;
        this.FechaProgramada = FechaProgramada;
        this.HoraProgramada = HoraProgramada;
        this.CantidadSolicitada = CantidadSolicitada;
        this.Tipo = Tipo;
        this.PersonaRequiere = PersonaRequiere;
        this.PersonaAutoriza = PersonaAutoriza;
        this.Entregado = Entregado;
        this.numPedido = numPedido;
        this.es = es;
        this.cantidadSolicitada = cantidadSolicitada;
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

    public String getFechaProgramada() {
        return FechaProgramada;
    }

    public void setFechaProgramada(String FechaProgramada) {
        this.FechaProgramada = FechaProgramada;
    }

    public String getHoraProgramada() {
        return HoraProgramada;
    }

    public void setHoraProgramada(String HoraProgramada) {
        this.HoraProgramada = HoraProgramada;
    }

    public int getCantidadSolicitada() {
        return CantidadSolicitada;
    }

    public void setCantidadSolicitada(int CantidadSolicitada) {
        this.CantidadSolicitada = CantidadSolicitada;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPersonaRequiere() {
        return PersonaRequiere;
    }

    public void setPersonaRequiere(String PersonaRequiere) {
        this.PersonaRequiere = PersonaRequiere;
    }

    public String getPersonaAutoriza() {
        return PersonaAutoriza;
    }

    public void setPersonaAutoriza(String PersonaAutoriza) {
        this.PersonaAutoriza = PersonaAutoriza;
    }

    public String getEntregado() {
        return Entregado;
    }

    public void setEntregado(String Entregado) {
        this.Entregado = Entregado;
    }
    
    public String getnumPedido(){
        return numPedido;
    }
    
    public void setnumPedido(String numPedido){
        this.numPedido = numPedido;
    }
    
    public String getes(){
        return es;
    }
    
    public void setes(String es){
        this.es = es;
    }
    
    public String getcantidadSolicitada(){
        return cantidadSolicitada;
    }
    
    public void setcantidadSolicitada(String cantidadSolicitada){
        this.cantidadSolicitada = cantidadSolicitada;
    }
}
