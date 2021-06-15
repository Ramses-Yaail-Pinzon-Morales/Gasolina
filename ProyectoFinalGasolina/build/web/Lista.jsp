<%-- 
    Document   : Lista
    Created on : 1 jun 2021, 17:39:27
    Author     : ShellyOdin21
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="Modelo.UsuarioDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de clientes</title>
    </head>
    <body>
        <h1>Clientes</h1>
        <a href="NuevoPedido.jsp">Programar Pedido</a>
        <table border="1" cellpadding="2">
            <thead>
                <tr>
                    <th>No. Pedido</th>
                    <th>Es</th>
                    <th>Fecha Programada</th>
                    <th>Hora Programada</th>
                    <th>Cantidad Solicitada</th>
                    <th>Tipo</th>
                    <th>Persona Requiere</th>
                    <th>Persona Autoriza</th>
                    <th>Entregado</th>
                </tr>
            </thead>
            <%
                UsuarioDAO dao = new UsuarioDAO();
                List<Cliente>list=dao.listar();
                Iterator<Cliente>iter=list.iterator();
                Cliente cliente=null;
                while(iter.hasNext()){
                    cliente=iter.next();
                
            %>
            <tbody>
                <tr>
                    <td><%= cliente.getNumPedido()%></td>
                    <td><%= cliente.getES()%></td>
                    <td><%= cliente.getFechaProgramada()%></td>
                    <td><%= cliente.getHoraProgramada()%></td>
                    <td><%= cliente.getCantidadSolicitada()%></td>
                    <td><%= cliente.getTipo()%></td>
                    <td><%= cliente.getPersonaRequiere()%></td>
                    <td><%= cliente.getPersonaAutoriza()%></td>
                    <td><%= cliente.getEntregado()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
