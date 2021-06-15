/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ShellyOdin21
 */
public class EstacionDAO implements CRUDEstacion{
    
    ConexionDB DB = new ConexionDB();
    Connection con=null;
    PreparedStatement ps;
    ResultSet rs;
    Estacion es = new Estacion();
    
    @Override
    public List listado() {
        ArrayList<Estacion>list=new ArrayList<>();
        String sql= "SELECT * FROM Es";
        try {
            con=DB.ConectarDB();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Estacion estacion = new Estacion();
                estacion.setEstacion(rs.getInt("Estacion"));
                estacion.setCorreo(rs.getString("Correo"));
                estacion.setEncargado(rs.getString("Encargado"));
                estacion.setTelefono(rs.getDouble("Telefono"));
                estacion.setNombre(rs.getString("Nombre"));
                estacion.setNombreEstacion(rs.getString("NombreEstacion"));
                estacion.setDireccion(rs.getString("Direccion"));
                list.add(estacion);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public Estacion list(int estacion) {
        Estacion est = new Estacion();
        String sql= "SELECT * FROM Es WHERE Estacion ="+estacion;
        try {
            con=DB.ConectarDB();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                est.setEstacion(rs.getInt("Estacion"));
                est.setCorreo(rs.getString("Correo"));
                est.setEncargado(rs.getString("Encargado"));
                est.setTelefono(rs.getDouble("Telefono"));
                est.setNombre(rs.getString("Nombre"));
                est.setNombreEstacion(rs.getString("NombreEstacion"));
                est.setDireccion(rs.getString("Direccion"));
            }
        } catch (SQLException e) {
        }
        return est;
    }

    @Override
    public boolean add(Estacion estacion) {
        
        String sql = "INSERT INTO Es VALUES (?,?,?,?,?,?,?)";
        try {
            con=DB.ConectarDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, estacion.getestacion());
            ps.setString(2, estacion.getCorreo());
            ps.setString(3, estacion.getEncargado());
            ps.setString(4, estacion.gettelefono());
            ps.setString(5, estacion.getNombre());
            ps.setString(6, estacion.getNombreEstacion());
            ps.setString(7, estacion.getDireccion());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return false;
    }

    @Override
    public boolean edit(Estacion estacion) {
        String sql = "UPDATE Es SET Correo=?, Encargado=?, Telefono=?, Nombre=?, NombreEstacion=?, Direccion=? WHERE Estacion=?";
        try {
            con=DB.ConectarDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, estacion.getCorreo());
            ps.setString(2, estacion.getEncargado());
            ps.setString(3, estacion.gettelefono());
            ps.setString(4, estacion.getNombre());
            ps.setString(5, estacion.getNombreEstacion());
            ps.setString(6, estacion.getDireccion());
            ps.setString(7, estacion.getestacion());
            ps.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return false;
    }

    @Override
    public boolean eliminar(int estacion) {
        String sql = "DELETE FROM Es WHERE Estacion ="+estacion;
        try {
            con=DB.ConectarDB();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return false;
    }
    
}
