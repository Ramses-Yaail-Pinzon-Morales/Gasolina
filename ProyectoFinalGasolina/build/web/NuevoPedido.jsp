<%-- 
    Document   : NuevoPedido
    Created on : 13 jun 2021, 14:58:17
    Author     : ShellyOdin21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="StylesPedidos.css" rel="stylesheet" type="text/css"/>
        <link href="styles.css" rel="stylesheet" type="text/css"/>
        <title>Programar Pedidos</title>
    </head>
    <body>
        <h1>Programar Nuevo Pedido</h1>
        <div class="login-box">
            <form action="agregar" method="POST">
                <label>Número de Pedido: </label>
                <input type="text" name="txtNumPedido"/>
                <label>Estación: </label>
                <input type="text" name="txtES"/>
                <label>Fecha Programada: </label>
                <input type="date" name="txtFechaProgramada" placeholder="dd/mm/aaaa"/>
                <label>Hora Programada: </label>
                <input type="time" name="txtHoraProgramada" placeholder="00:00:00"/>
                <label>Cantidad Solicitada: </label>
                <input type="text" name="txtCantidadSolicitada"/>
                <label>Tipo: </label>
                <input type="text" name="txtTipo"/>
                <label>Persona que lo Requiere: </label>
                <input type="text" name="txtPersonaRequiere"/>
                <label>Persona que lo Autoriza: </label>
                <input type="text" name="txtPersonaAutoriza"/>
                <label>Entregado: </label>
                <input type="text" name="txtEntregado"/>
                <input type="submit" value="Programar" name="accion" class="btn"/>
            </form>
            <a href="Lista.jsp">Lista de Pedidos</a>
        </div>
    </body>
</html>
