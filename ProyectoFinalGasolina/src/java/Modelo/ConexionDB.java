/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;

/**
 *
 * @author ShellyOdin21
 */
public class ConexionDB {
    private static Connection conecta;
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String user = "sql5414103";
    private static String password = "xxPmv2AG8H";
    private static String url = "jdbc:mysql://sql5.freemysqlhosting.net:3306/sql5414103"+"?useTimezone=true&serverTimezone=UTC";
    
    //Conexión
    public ConexionDB(){
        conecta = null;
        try {
            Class.forName(driver);
            conecta = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
        }
    }
    public Connection ConectarDB(){
        return conecta;
    }
}
