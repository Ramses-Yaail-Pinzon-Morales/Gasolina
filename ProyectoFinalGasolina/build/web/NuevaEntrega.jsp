<%-- 
    Document   : NuevaEntrega
    Created on : 13 jun 2021, 16:58:56
    Author     : ShellyOdin21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Entrega</title>
    </head>
    <body>
        <h1>Entregas</h1>
        <form action="agregar" method="POST">
            <label>Numero de Pedido: </label>
            <input type="text" name="txtNumPedido"/>
            <label>Estación: </label>
            <input type="text" name="txtES"/>
            <label>Fecha de Entrega: </label>
            <input type="date" name="txtFechaEntrega"/>
            <label>Hora Entrega: </label>
            <input type="time" name="txtHoraEntrega"/>
            <label>Nombre del Operador: </label>
            <input type="text" name="txtNombreOperador"/>
            <label>Cantidad Entregada: </label>
            <input type="text" name="txtCantidadEntregada"/>
            <label>Tipo: </label>
            <input type="text" name="txtTipo"/>
            <label>Diferencia: </label>
            <input type="text" name="txtDiferencia"/>
            <label>Factura: </label>
            <input type="text" name="txtFactura"/>
            <label>Nota: </label>
            <input type="text" name="txtNota"/>
            <label>Cumplido: </label>
            <input type="text" name="txtCumplido"/>
            <input type="submit" name="accion" value="Registrar"/>
        </form>
    </body>
</html>
