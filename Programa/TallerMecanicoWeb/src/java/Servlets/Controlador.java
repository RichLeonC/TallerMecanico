/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Control.AdmClientes;
import Control.AdmFacturas;
import Control.AdmManoReparaciones;
import Control.AdmMecanicos;
import Control.AdmMecanicosSecundarios;
import Control.AdmReparaciones;
import Control.AdmRepuestoReparacion;
import Control.AdmVehiculos;
import Modelo.Vehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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

    int id;
    AdmClientes clientes = new AdmClientes();
    AdmVehiculos vehiculos = new AdmVehiculos();
    AdmMecanicos mecanicos = new AdmMecanicos();
    AdmReparaciones reparaciones = new AdmReparaciones();
    AdmMecanicosSecundarios secundarios = new AdmMecanicosSecundarios();
    AdmRepuestoReparacion repuestosR = new AdmRepuestoReparacion();
    AdmManoReparaciones manoR = new AdmManoReparaciones();
    AdmFacturas facturas = new AdmFacturas();
    
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

            switch(accion){
                case "Cliente":
                    request.getRequestDispatcher("General/Cliente.jsp").forward(request, response); //Redirecciona a esa pagina
                    break;
                case "Agregar": //Agrega Clientes
                    String cedula = request.getParameter("txtCedula"); //Obtiene el string que escribio el usuario en el form
                    String nombre = request.getParameter("txtNombre");
                    String apellido1 = request.getParameter("txtApellido1");
                    String apellido2 = request.getParameter("txtApellido2");
                    String direccion = request.getParameter("txtDireccion");
                    String telefono = request.getParameter("txtTelefono");
                    clientes.agregar(cedula, nombre, apellido1, apellido2, direccion, telefono);
                    request.getRequestDispatcher("General/Cliente.jsp").forward(request, response);
                    break;
                case "Vehiculo":
                    request.getRequestDispatcher("General/Vehiculo.jsp").forward(request, response);
                    break;
                case "EditarV":
                    id=Integer.parseInt(request.getParameter("id"));
                    Vehiculo v = vehiculos.listarPlaca(id);
                    request.setAttribute("vehiculo", v);
                    request.getRequestDispatcher("General/Vehiculo.jsp").forward(request, response);
                    break;
                case "Actualizar":
                    String placa = request.getParameter("txtPlaca"); 
                    String propietario = request.getParameter("cliente");
                    String marca = request.getParameter("txtMarca");
                    String modelo = request.getParameter("txtModelo");
                    String anio = request.getParameter("txtAnio");
                    String color = request.getParameter("txtColor");
                    vehiculos.actualizar(placa, propietario, marca, modelo, anio, color);
                    request.getRequestDispatcher("General/Vehiculo.jsp").forward(request, response);
                    break;
                    
                case "Mecanico":
                    request.getRequestDispatcher("General/Mecanico.jsp").forward(request, response);
                    break;
                case "EliminarM":
                    id = Integer.parseInt(request.getParameter("id"));
                    mecanicos.eliminar(id);
                    request.getRequestDispatcher("General/Mecanico.jsp").forward(request, response);
                    break;
                case "Repuesto":
                    request.getRequestDispatcher("General/Repuesto.jsp").forward(request, response);
                    break;
                case "Reparacion":
                    request.getRequestDispatcher("General/Reparacion.jsp").forward(request, response);
                    break;
                case "AgregarR":
                    String ide = request.getParameter("txtId");
                    String placa1 = request.getParameter("placa");
                    
                    String mecanico1 = request.getParameter("mecanico");
                    String fecha = request.getParameter("txtFecha");
                  
                    reparaciones.agregar(ide, placa1, mecanico1, fecha);
                    request.getRequestDispatcher("General/Reparacion.jsp").forward(request, response);
                    break;
                case "AsociarM":
                    request.getRequestDispatcher("General/Mecanico_Secundario.jsp").forward(request, response);
                    break;
                case "AgregarMS":
                    String idR = request.getParameter("id");
                    String cod = request.getParameter("codigo");
                    secundarios.agregar(idR, cod);
                    request.getRequestDispatcher("General/Mecanico_Secundario.jsp").forward(request, response);
                    break;
                case "AnotarR":
                    request.getRequestDispatcher("General/Repuesto_Reparacion.jsp").forward(request, response);
                    break;
                case "AgregarRR":
                    String code = request.getParameter("codRepuesto");
                    String ideR = request.getParameter("idR");
                    repuestosR.agregar(code, ideR);
                    request.getRequestDispatcher("General/Repuesto_Reparacion.jsp").forward(request, response);
                    break;
                case "AnotarMO":
                    request.getRequestDispatcher("General/ManoObra_Reparacion.jsp").forward(request, response);
                    break;
                case "AgregarMR":
                    String codeO = request.getParameter("codObra");
                    String idO=request.getParameter("idR");
                    manoR.agregar(codeO, idO);
                    request.getRequestDispatcher("General/ManoObra_Reparacion.jsp").forward(request, response);
                    break;
                case "Factura":
                    request.getRequestDispatcher("General/Factura.jsp").forward(request, response);
                    break;
                case "AgregarF":
                    String num = request.getParameter("txtNum");
                    String ideF = request.getParameter("id");
                    String fechaF = request.getParameter("txtFecha");
                    facturas.agregar(num, ideF, fechaF);
                    request.getRequestDispatcher("General/Factura.jsp").forward(request, response);
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
