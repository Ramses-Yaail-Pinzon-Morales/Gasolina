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
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <link href="StylesPedidos.css" rel="stylesheet" type="text/css"/>
        <title>Nuevo Cliente</title>
    </head>
    <body>
        <div>
            <div style="position: absolute">
                <h1>Ingresar un Nuevo cliente</h1>
            </div>
            <br>
            <div class="login-box" style="margin-top: 100px;">
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
        </div>
        
    </body>
</html>
