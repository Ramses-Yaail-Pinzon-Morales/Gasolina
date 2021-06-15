<%-- 
    Document   : Factura
    Created on : 13 jun 2021, 20:23:37
    Author     : ShellyOdin21
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Factura"%>
<%@page import="Modelo.FacturaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factura</title>
    </head>
    <body>
        <h1>Factura</h1>
        <table border="2" cellpadding="3">
            <thead>
                <tr>
                    <th>Operación</th>
                    <th>Fecha</th>
                    <th>Litros</th>
                    <th>Comisión</th>
                    <th>Importe</th>
                    <th>IVA</th>
                    <th>TOTAL</th>
                    <th>Fecha de Pago</th>
                    <th>ComDesp</th>
                    <th>Monto a Repartir</th>
                    <th>Monto Individual</th>
                </tr>
            </thead>
            <%
                FacturaDAO dao = new FacturaDAO();
                List<Factura> list = dao.Listado();
                Iterator<Factura> iter=list.iterator();
                Factura factura = null;
                while(iter.hasNext()){
                    factura = iter.next();
            %>
            <tbody>
                <tr>
                    <td><%= factura.getOperacion()%></td>
                    <td><%= factura.getFecha()%></td>
                    <td><%= factura.getlitros()%></td>
                    <td><%= factura.getComision()%></td>
                    <td><%= factura.getImporte()%></td>
                    <td><%= factura.getIVA()%></td>
                    <td><%= factura.getTotal()%></td>
                    <td><%= factura.getFechaPago()%></td>
                    <td><%= factura.getComDesp()%></td>
                    <td><%= factura.getMontoRepartir()%></td>
                    <td><%= factura.getMontoIndividual()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
