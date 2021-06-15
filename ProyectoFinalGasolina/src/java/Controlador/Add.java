/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Entrega;
import Modelo.EntregaDAO;
import Modelo.Estacion;
import Modelo.EstacionDAO;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ShellyOdin21
 */
public class Add extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        Estacion es = new Estacion();
        EstacionDAO dao = new EstacionDAO();
        Cliente cl = new Cliente();
        UsuarioDAO udao = new UsuarioDAO();
        Entrega en = new Entrega();
        EntregaDAO endao = new EntregaDAO();
        String action = request.getParameter("accion");
            if(action.equals("Guardar")){
                String Estacion = request.getParameter("txtEstacion");
                String Correo = request.getParameter("txtCorreo");
                String Encargado = request.getParameter("txtEncargado");
                String Telefono = request.getParameter("txtTelefono");
                String Nombre = request.getParameter("txtNombre");
                String NombreEstacion = request.getParameter("txtNEstacion");
                String Direccion = request.getParameter("txtDireccion");
                es.setestacion(Estacion);
                es.setCorreo(Correo);
                es.setEncargado(Encargado);
                es.settelefono(Telefono);
                es.setNombre(Nombre);
                es.setNombreEstacion(NombreEstacion);
                es.setDireccion(Direccion);
                dao.add(es);
                request.getRequestDispatcher("AdminCliente.jsp").forward(request, response);
            } else {
                if(action.equals("Actualizar")){
                String Estacion = request.getParameter("txtEstacion");
                String Correo = request.getParameter("txtCorreo");
                String Encargado = request.getParameter("txtEncargado");
                String Telefono = request.getParameter("txtTelefono");
                String Nombre = request.getParameter("txtNombre");
                String NombreEstacion = request.getParameter("txtNEstacion");
                String Direccion = request.getParameter("txtDireccion");
                es.setestacion(Estacion);
                es.setCorreo(Correo);
                es.setEncargado(Encargado);
                es.settelefono(Telefono);
                es.setNombre(Nombre);
                es.setNombreEstacion(NombreEstacion);
                es.setDireccion(Direccion);
                dao.edit(es);
                request.getRequestDispatcher("AdminCliente.jsp").forward(request, response);
                } else {
                    if(action.equals("Programar")){
                        String NumPedido = request.getParameter("txtNumPedido");
                        String ES = request.getParameter("txtES");
                        String FechaProgramada = request.getParameter("txtFechaProgramada");
                        String HoraProgramada = request.getParameter("txtHoraProgramada");
                        String CantidadSolicitada = request.getParameter("txtCantidadSolicitada");
                        String Tipo = request.getParameter("txtTipo");
                        String PersonaAutoriza = request.getParameter("txtPersonaAutoriza");
                        String PersonaRequiere = request.getParameter("txtPersonaRequiere");
                        String Entregado = request.getParameter("txtEntregado");
                        cl.setnumPedido(NumPedido);
                        cl.setes(ES);
                        cl.setFechaProgramada(FechaProgramada);
                        cl.setHoraProgramada(HoraProgramada);
                        cl.setcantidadSolicitada(CantidadSolicitada);
                        cl.setTipo(Tipo);
                        cl.setPersonaRequiere(PersonaRequiere);
                        cl.setPersonaAutoriza(PersonaAutoriza);
                        cl.setEntregado(Entregado);
                        udao.add(cl);
                        request.getRequestDispatcher("Lista.jsp").forward(request, response);
                    } else {
                        if(action.equals("Registrar")){
                            String NumPedido = request.getParameter("txtNumPedido");
                            String Estacion = request.getParameter("txtES");
                            String FechaEntrega = request.getParameter("txtFechaEntrega");
                            String HoraEntrega = request.getParameter("txtHoraEntrega");
                            String NombreOperador = request.getParameter("txtNombreOperador");
                            String CantidadEntregada = request.getParameter("txtCantidadEntregada");
                            String Tipo = request.getParameter("txtTipo");
                            String Diferencia = request.getParameter("txtDiferencia");
                            String Factura = request.getParameter("txtFactura");
                            String Nota = request.getParameter("txtNota");
                            String Cumplido = request.getParameter("txtCumplido");
                            en.setnumPedido(NumPedido);
                            en.setes(Estacion);
                            en.setFechaEntrega(FechaEntrega);
                            en.setHoraEntrega(HoraEntrega);
                            en.setNombreOperador(NombreOperador);
                            en.setCantidadEntregada(CantidadEntregada);
                            en.setTipo(Tipo);
                            en.setDiferencia(Diferencia);
                            en.setFactura(Factura);
                            en.setNota(Nota);
                            en.setCumplido(Cumplido);
                            endao.add(en);
                            request.getRequestDispatcher("Entregas.jsp").forward(request, response);
                        }
                    } 
                }
            }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
