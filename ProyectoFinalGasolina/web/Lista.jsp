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
        <link href="StylesPedidos.css" rel="stylesheet" type="text/css"/>
        <title>Lista de Pedidos</title>
    </head>
    <body>
        <h1>Pedidos</h1>
        <a href="NuevoPedido.jsp">Nuevo Pedido</a><a href="index.html" style="float: right"> Menú Principal</a><br><br>
        <table border="3" cellpadding="2" class="table">
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
                    <th>Acciones</th>
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
                    <td>
                        <a class="do" href="operar?accion=editarR&id=<%= cliente.getNumPedido()%>">Editar</a>
                        <a class="do" href="operar?accion=eliminarR&id=<%= cliente.getNumPedido()%>">Eliminar</a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
