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
public class FacturaDAO implements CRUDFactura{
    
    ConexionDB DB = new ConexionDB();
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    Factura fac = new Factura();
    
    @Override
    public List Listado() {
        ArrayList<Factura>list = new ArrayList<>();
        String sql = "SELECT * FROM Facturas";
        try {
            con = DB.ConectarDB();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Factura factura = new Factura();
                factura.setOperacion(rs.getInt("Operacion"));
                factura.setFecha(rs.getString("fecha"));
                factura.setlitros(rs.getString("litros"));
                factura.setComision(rs.getString("comision"));
                factura.setImporte(rs.getString("importe"));
                factura.setIVA(rs.getString("IVA"));
                factura.setTotal(rs.getString("TOTAL"));
                factura.setFechaPago(rs.getString("FechaPago"));
                factura.setComDesp(rs.getString("ComDesp"));
                factura.setMontoRepartir(rs.getString("MontoRepartir"));
                factura.setMontoIndividual(rs.getString("MontoIndividual"));
                list.add(factura);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return list;
    }
    
}
