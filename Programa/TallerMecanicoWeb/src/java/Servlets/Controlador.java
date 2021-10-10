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
        String menu = request.getParameter("menu"); //Recibe la seccion del menu en la que estamos
        String accion = request.getParameter("accion"); //Recibe la accion para ejecutar
        
        if(menu.equals("Cliente")){//Entra a la pagina de clientes
            request.getRequestDispatcher("General/Cliente.jsp").forward(request, response); //Redirecciona a esa pagina
            switch(accion){
                 case "Agregar": //Agrega Clientes
                    String cedula = request.getParameter("txtCedula"); //Obtiene el string que escribio el usuario en el form
                    String nombre = request.getParameter("txtNombre");
                    String apellido1 = request.getParameter("txtApellido1");
                    String apellido2 = request.getParameter("txtApellido2");
                    String direccion = request.getParameter("txtDireccion");
                    String telefono = request.getParameter("txtTelefono");
                    clientes.agregar(cedula, nombre, apellido1, apellido2, direccion, telefono);
                    break;
            }
            
            
        }
            
        else if(menu.equals("Vehiculo")){//Entra a la pagina de Vehiculos
             request.getRequestDispatcher("General/Vehiculo.jsp").forward(request, response); //Redirecciona a esa pagina
             
         }
        
        else if(menu.equals("Mecanico")){//Entra a la pagina de Mecanicos
             
             
         }
        
        else if(menu.equals("Repuesto")){//Entra a la pagina de Repuestos
             
             
         }
        
        else if(menu.equals("Reparacion")){//Entra a la pagina de Reparaciones
             
             
         }
        
        else if(menu.equals("Factura")){//Entra a la pagina de Factura
             
             
         }
        
        else if(menu.equals("Consulta")){//Entra a la pagina de Consultas
             
             
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
