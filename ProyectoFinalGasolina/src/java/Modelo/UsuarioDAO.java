/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import java.util.*;
import java.sql.*;
/**
 *
 * @author ShellyOdin21
 */
public class UsuarioDAO implements CRUD {
    
    ConexionDB DB = new ConexionDB();
    Connection con=null;
    PreparedStatement ps;
    ResultSet rs;
    Cliente usuario = new Cliente();
    
    @Override
    public List listar() {
       ArrayList<Cliente>list=new ArrayList<>();
        String sql = "SELECT * FROM Pedidos";
        try {
            con = DB.ConectarDB();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setNumPedido(rs.getInt("NumPedido"));
                cliente.setFechaProgramada(rs.getString("FechaProgramada"));
                cliente.setES(rs.getInt("ES"));
                cliente.setHoraProgramada(rs.getString("HoraProgramada"));
                cliente.setTipo(rs.getString("Tipo"));
                cliente.setCantidadSolicitada(rs.getInt("CantidadSolicitada"));
                cliente.setPersonaAutoriza(rs.getString("PersonaAutoriza"));
                cliente.setPersonaRequiere(rs.getString("PersonaRequiere"));
                cliente.setEntregado(rs.getString("Entregado"));
                list.add(cliente);
            }
        } catch (SQLException e) {
        }
        return list;
    }

    @Override
    public Cliente list(int NumPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Cliente cliente) {
        String sql = "INSERT INTO Pedidos VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            con=DB.ConectarDB();
            ps = con.prepareCall(sql);
            ps.setString(1, cliente.getnumPedido());
            ps.setString(2, cliente.getes());
            ps.setString(3, cliente.getFechaProgramada());
            ps.setString(4, cliente.getHoraProgramada());
            ps.setString(5, cliente.getcantidadSolicitada());
            ps.setString(6, cliente.getTipo());
            ps.setString(7, cliente.getPersonaRequiere());
            ps.setString(8, cliente.getPersonaAutoriza());
            ps.setString(9, cliente.getEntregado());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return false;
    }

    @Override
    public boolean edit(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int NumPedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
