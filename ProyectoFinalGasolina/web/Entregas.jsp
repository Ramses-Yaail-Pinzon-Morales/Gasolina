<%-- 
    Document   : Entregas
    Created on : 13 jun 2021, 16:54:56
    Author     : ShellyOdin21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Entrega"%>
<%@page import="Modelo.EntregaDAO"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Entregas</title>
    </head>
    <body>
        <h1>Entregas</h1>
        <table border="1" cellpadding="2">
            <thead>
                <tr>
                    <th>No. Pedido</th>
                    <th>Estación</th>
                    <th>Fecha Entrega</th>
                    <th>Hora Entrega</th>
                    <th>Nombre Operador</th>
                    <th>Cantidad Entregada</th>
                    <th>Tipo</th>
                    <th>Diferencia</th>
                    <th>Factura</th>
                    <th>Nota</th>
                    <th>Cumplido</th>
                    <th>Acción</th>
                </tr>
            </thead>
            <%
                EntregaDAO dao = new EntregaDAO();
                List<Entrega>list=dao.listado();
                Iterator<Entrega>iter=list.iterator();
                Entrega entrega=null;
                while(iter.hasNext()){
                    entrega=iter.next();
            %>
            <tbody>
                <tr>
                    <td><%=entrega.getNumPedido()%></td>
                    <td><%=entrega.getES()%></td>
                    <td><%=entrega.getFechaEntrega()%></td>
                    <td><%=entrega.getHoraEntrega()%></td>
                    <td><%=entrega.getNombreOperador()%></td>
                    <td><%=entrega.getCantidadEntregada()%></td>
                    <td><%=entrega.getTipo()%></td>
                    <td><%=entrega.getDiferencia()%></td>
                    <td><%=entrega.getFactura()%></td>
                    <td><%=entrega.getNota()%></td>
                    <td><%=entrega.getCumplido()%></td>
                    <td>
                        <a href="operar?accion=edit&id=<%= entrega.getNumPedido()%>">Editar</a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
