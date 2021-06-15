<%-- 
    Document   : VentaGeneral
    Created on : 13 jun 2021, 21:00:48
    Author     : ShellyOdin21
--%><%@page import="java.util.Iterator"%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Factura"%>
<%@page import="Modelo.FacturaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script>
            
            var fecha = new Date();
            var mes = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"];
            var dia = ["Domingo","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado"];
            document.write(dia[fecha.getDay()]+" "+fecha.getDate()+" de "+mes[fecha.getMonth()]+" del "+fecha.getFullYear());
                        
        </script>
        <title>Venta General</title>
    </head>
    <body>
        <h1>Venta General</h1>
        <table border="1" cellpadding="2">
            <thead>
                <tr>
                    <th>Fecha</th>
                    <th>Venta General</th>
                </tr>
            </thead>
            <%
                FacturaDAO dao = new FacturaDAO();
                List<Factura> list = dao.Listado();
                Iterator<Factura> iter=list.iterator();
                Factura factura = null;
                while(iter.hasNext()){
                    factura = iter.next();
            %>
            <tbody>
                <tr>
                    <td><%= factura.getFecha()%></td>
                    <td><%= factura.getTotal()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>

    </body>
</html>
