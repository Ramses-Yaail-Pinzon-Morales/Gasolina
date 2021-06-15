/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
/**
 *
 * @author ShellyOdin21
 */
public interface CRUDEntrega {
    public List listado();
    public Entrega list(int entrega);
    public boolean add(Entrega entrega);
    public boolean edit(Entrega entrega);
    public boolean eliminar(int entrega);
}
