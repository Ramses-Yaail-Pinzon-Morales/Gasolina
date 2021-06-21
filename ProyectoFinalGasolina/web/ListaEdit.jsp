<%-- 
    Document   : ListaEdit
    Created on : 17 jun 2021, 19:23:53
    Author     : ShellyOdin21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Pedido</title>
    </head>
    <body>
        <h1>Editar Pedido</h1>
        <form action="agregar" method="POST">
            <labe>Número del Pedido: </labe>
            <input type="text" name="txtNumPedido" value="${idCliente}"/>
            <label>Estación: </label>
            <input type="text" name="txtES"/>
            <label>Fecha Programada: </label>
            <input type="date" name="txtFechaProgramada"/>
            <label>Hora Programada: </label>
            <input type="time" name="txtHoraProgramada"/>
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
            <input type="submit" value="Actualizar Pedido" name="accion"/>
        </form>
    </body>
</html>
