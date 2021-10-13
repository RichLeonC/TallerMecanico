<%-- 
    Document   : Factura
    Created on : 12/10/2021, 07:54:25 PM
    Author     : richa
--%>

<%@page import="Modelo.Factura"%>
<%@page import="Control.AdmFacturas"%>
<%@page import="Modelo.Reparacion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmReparaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" ></script>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
        <title>Facturas</title>
    </head>
    <body>
       <div class="d-flex">
            <div class = "card col-sm-4">
                <div class = "card-body">
                    <form>
                        <div class="form-group">
                            <label>Numero</label>
                            <Input type="text" name="txtNum" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Id Reparacion</label>
                            <select class="form-select" aria-label="Default select example" name ="id">                          
                                
                                <% 
                                AdmReparaciones reparaciones = new AdmReparaciones();
                                ArrayList<Reparacion> lista = reparaciones.listar();
                                for(Reparacion r:lista){
                            
                             %>
                             <option><%=r.getId() %></option>
                             <%}%>
                              </select>
                        </div>                
                         <div class="form-group">
                            <label>Fecha de Entregado (AAAA/MM/DD)</label>
                            <Input type="text" name="txtFecha" class="form-control"/>
                        </div>
                         
                        <br/>
                        <button type="submit" name="accion" value="AgregarF" class ="btn btn-primary">Agregar</button>
               
                    </form>
                     </div>
                </div>
                <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Numero</th>
                                <th>Id Reparacion</th>
                                <th>Fecha de Entregado</th>
                                 <th>Total a pagar</th>
                               
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmFacturas facturas = new AdmFacturas();
                               ArrayList<Factura> listaF = facturas.listar();
                               for(Factura f:listaF){
                            
                             %>
                             <tr>
                                 <td><%=f.getNumero() %></td>
                                 <td><%=f.getIdReparacion() %></td>
                                 <td><%=f.getFechaEntregado() %></td>
                                 <td><%=f.getTotalAPagar() %></td>

                                 
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>

        </div>
    </body>
</html>
