<%-- 
    Document   : AgregarCliente
    Created on : 8 jun 2021, 11:40:35
    Author     : ShellyOdin21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Cliente</title>
    </head>
    <body>
        <div>
            <h1>Ingresar un Nuevo cliente</h1>
            <br>
            <form action="agregar" method="POST">
                <label>Estación:</label>
                <input type="text" name="txtEstacion"/>
                <label>Correo:</label>
                <input type="text" name="txtCorreo"/>
                <label>Encargado:</label>
                <input type="text" name="txtEncargado"/>
                <label>Teléfono:</label>
                <input type="text" name="txtTelefono"/>
                <label>Nombre:</label>
                <input type="text" name="txtNombre"/><br>
                <label>Nombre de la Estación:</label>
                <input type="text" name="txtNEstacion"/>
                <label>Dirección:</label>
                <input type="text" name="txtDireccion"/>
                <input type="submit" name="accion" value="Guardar"/>
                <br><br>
                <a href="AdminCliente.jsp">Lista de Clientes</a>
            </form>
        </div>
        
    </body>
</html>
