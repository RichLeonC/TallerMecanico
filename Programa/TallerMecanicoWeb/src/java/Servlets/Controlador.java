/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Control.AdmClientes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author richa
 */
@WebServlet(name = "Controlador", urlPatterns = { "/Controlador" })
public class Controlador extends HttpServlet {

    String agregar = "Clientes/Agregar.jsp";
    String modificar = "Modificar.jsp";
    String cliente= "Clientes/Cliente.jsp";
    String acceso="";
    AdmClientes clientes = new AdmClientes();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
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
        
        RequestDispatcher dispatcher = null;
        String accion = request.getParameter("accion");
        
        switch(accion){
            case "Cliente":
                request.getRequestDispatcher("Clientes/Cliente.jsp").forward(request, response);
                break;
            case "Vehiculo":
                request.getRequestDispatcher("General/Vehiculo.jsp").forward(request, response);
                break;
        }
           
        
          
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
