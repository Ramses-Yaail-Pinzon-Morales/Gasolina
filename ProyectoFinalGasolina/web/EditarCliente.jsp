<%-- 
    Document   : EditarCliente
    Created on : 10 jun 2021, 13:11:37
    Author     : ShellyOdin21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <link href="StylesPedidos.css" rel="stylesheet" type="text/css"/>
        <title>Editar Cliente</title>
    </head>
    <body>
        <h1>Cambiar Datos del Cliente</h1>
        <div class="login-box" style="margin-top: 100px;">
            <form action="agregar" method="POST">
                <label>Estación:</label>
                <input type="text" name="txtEstacion" value=""/>
                <label>Correo:</label>
                <input type="text" name="txtCorreo" value=""/>
                <label>Encargado:</label>
                <input type="text" name="txtEncargado" value=""/>
                <label>Teléfono:</label>
                <input type="text" name="txtTelefono" value=""/>
                <label>Nombre:</label>
                <input type="text" name="txtNombre" value=""/><br>
                <label>Nombre de la Estación:</label>
                <input type="text" name="txtNEstacion" value=""/>
                <label>Dirección:</label>
                <input type="text" name="txtDireccion" value=""/>
                <input type="submit" name="accion" value="Actualizar"/>
                <br><br>
                <a href="AdminCliente.jsp">Lista de Clientes</a>
            </form>
        </div>
    </body>
</html>
