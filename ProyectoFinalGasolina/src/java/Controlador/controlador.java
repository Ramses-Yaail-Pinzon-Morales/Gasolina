/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Estacion;
import Modelo.EstacionDAO;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author ShellyOdin21
 */
public class controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Estacion es = new Estacion();
    EstacionDAO dao = new EstacionDAO();
    Cliente cliente = new Cliente();
    UsuarioDAO usdao = new UsuarioDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("accion");
        if(action.equals("Pedidos")){
            request.getRequestDispatcher("Lista.jsp").forward(request, response);
        } else {
            if(action.equals("Listar Cliente")){
                request.getRequestDispatcher("AdminCliente.jsp").forward(request, response);
            } else {
                if(action.equals("editar")){
                    request.getRequestDispatcher("EditarCliente.jsp").forward(request, response);
                }  else{
                    if(action.equals("eliminar")){
                        int Estacion;
                        Estacion = Integer.parseInt(request.getParameter("id"));
                        es.setEstacion(Estacion);
                        dao.eliminar(Estacion);
                        request.getRequestDispatcher("AdminCliente.jsp").forward(request, response);
                    } else {
                        if(action.equals("Entregas")){
                            request.getRequestDispatcher("Entregas.jsp").forward(request, response);
                        } else {
                            if(action.equals("Factura")){
                                request.getRequestDispatcher("Factura.jsp").forward(request, response);
                            } else {
                                if(action.equals("Venta General")){
                                    request.getRequestDispatcher("VentaGeneral.jsp").forward(request, response);
                                } else {
                                    if (action.equals("edit")){
                                        request.setAttribute("idEnt", request.getParameter("id"));
                                        request.getRequestDispatcher("NuevaEntrega.jsp").forward(request, response);
                                    } else{
                                        if (action.equals("editarR")){
                                        request.setAttribute("idCliente", request.getParameter("id"));
                                        request.getRequestDispatcher("ListaEdit.jsp").forward(request, response);
                                        
                                        } else {
                                            if(action.equals("eliminarR")){
                                                int NumPedido;
                                                NumPedido = Integer.parseInt(request.getParameter("id"));
                                                cliente.setNumPedido(NumPedido);
                                                usdao.eliminar(NumPedido);
                                                request.getRequestDispatcher("Lista.jsp").forward(request, response);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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
