<%-- 
    Document   : AdminCliente
    Created on : 3 jun 2021, 15:18:27
    Author     : ShellyOdin21
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Estacion"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.EstacionDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <link href="StylesPedidos.css" rel="stylesheet" type="text/css"/>
        <title>Clientes</title>
    </head>
    <body>
        <h1>Clientes de la Gasolinería</h1><br>
        <a href="AgregarCliente.jsp">Nuevo Registro</a><a href="index.html" style="float: right"> Menú Principal</a>
        <br><br>
        <table border="2" cellpadding="3">
            <thead>
                <tr>
                    <th>Estación</th>
                    <th>Correo</th>
                    <th>Encargado</th>
                    <th>Teléfono</th>
                    <th>Nombre</th>
                    <th>Nombre Estación</th>
                    <th>Dirección</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <%
                EstacionDAO dao = new EstacionDAO();
                List<Estacion>list=dao.listado();
                Iterator<Estacion>iter=list.iterator();
                Estacion estacion = null;
                while(iter.hasNext()){
                    estacion = iter.next();
                    
            %>
            <tbody>
                <tr>
                    <td><%= estacion.getEstacion()%></td>
                    <td><%= estacion.getCorreo()%></td>
                    <td><%= estacion.getEncargado()%></td>
                    <td><%= estacion.getTelefono()%></td>
                    <td><%= estacion.getNombre()%></td>
                    <td><%= estacion.getNombreEstacion()%></td>
                    <td><%= estacion.getDireccion()%></td>
                    <td>
                        <a href="operar?accion=editar&id=<%= estacion.getEstacion()%>">Editar</a>
                        <a href="operar?accion=eliminar&id=<%= estacion.getEstacion()%>">Borrar</a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
