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
public class EntregaDAO implements CRUDEntrega{
    
    ConexionDB DB = new ConexionDB();
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    Entrega ent = new Entrega();
    
    @Override
    public List listado() {
        ArrayList<Entrega>list=new ArrayList<>();
        String sql = "SELECT * FROM Entrega";
        try {
            con = DB.ConectarDB();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Entrega entrega = new Entrega();
                entrega.setNumPedido(rs.getInt("NumPedido"));
                entrega.setES(rs.getInt("ES"));
                entrega.setFechaEntrega(rs.getString("FechaEntrega"));
                entrega.setHoraEntrega(rs.getString("HoraEntrega"));
                entrega.setNombreOperador(rs.getString("NombreOperador"));
                entrega.setCantidadEntregada(rs.getString("Cantidad Entregada (Netos)"));
                entrega.setTipo(rs.getString("Tipo"));
                entrega.setDiferencia(rs.getString("Diferencia"));
                entrega.setFactura(rs.getString("Factura"));
                entrega.setNota(rs.getString("Nota"));
                entrega.setCumplido(rs.getString("Cumplido"));
                list.add(entrega);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return list;
    }

    @Override
    public Entrega list(int entrega) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Entrega entrega) {
        String sql = "INSERT INTO Entrega VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = DB.ConectarDB();
            ps = con.prepareStatement(sql);
            ps.setString(1, entrega.getnumPedido());
            ps.setString(2, entrega.getes());
            ps.setString(3, entrega.getFechaEntrega());
            ps.setString(4, entrega.getHoraEntrega());
            ps.setString(5, entrega.getNombreOperador());
            ps.setString(6, entrega.getCantidadEntregada());
            ps.setString(7, entrega.getTipo());
            ps.setString(8, entrega.getDiferencia());
            ps.setString(9, entrega.getFactura());
            ps.setString(10, entrega.getNota());
            ps.setString(11, entrega.getCumplido());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return false;
    }

    @Override
    public boolean edit(Entrega entrega) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int entrega) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
