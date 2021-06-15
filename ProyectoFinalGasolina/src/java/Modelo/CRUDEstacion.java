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
public interface CRUDEstacion {
    public List listado();
    public Estacion list(int estacion);
    public boolean add(Estacion estacion);
    public boolean edit(Estacion estacion);
    public boolean eliminar(int estacion);
}
