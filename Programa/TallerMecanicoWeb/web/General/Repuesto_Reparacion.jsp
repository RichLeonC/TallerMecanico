<%-- 
    Document   : Repuesto_Reparacion
    Created on : 12/10/2021, 02:37:09 PM
    Author     : richa
--%>

<%@page import="Modelo.RepuestoReparacion"%>
<%@page import="Control.AdmRepuestoReparacion"%>
<%@page import="Modelo.Reparacion"%>
<%@page import="Modelo.Reparacion"%>
<%@page import="Control.AdmReparaciones"%>
<%@page import="Modelo.Repuesto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmRepuestos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" ></script>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
        <title>Anotar Repuesto</title>
    </head>
    <body>
        <div class="d-flex">
            <div class = "card col-sm-4">
                <div class = "card-body">
                    <form>
                        <div class="form-group">
                            <label>Codigo Repuesto</label>
                            <select class="form-select" aria-label="Default select example" name ="codRepuesto">                          
                                
                                <% 
                               AdmRepuestos repuestos = new AdmRepuestos();
                               ArrayList<Repuesto> listaRepuestos = repuestos.listar();
                               for(Repuesto r:listaRepuestos){
                            
                             %>
                             <option><%=r.getCodigo() %></option>
                             <%}%>
                              </select>
                        </div>
                         <div class="form-group">   
                              <label>Id Reparacion</label>
                            <select class="form-select" aria-label="Default select example" name ="idR">                          
                                
                                <% 
                                AdmReparaciones reparaciones = new AdmReparaciones();
                                ArrayList<Reparacion> lista = reparaciones.listar();
                                for(Reparacion r:lista){
                            
                             %>
                             <option><%=r.getId() %></option>
                             <%}%>
                              </select>
                        </div>         
                        <br/>
                        <button type="submit" name="accion" value="AgregarRR" class ="btn btn-primary">Agregar</button>
                            
                        
                            
                    </form>
                     </div>
                </div>
                <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Codigo de Repuesto</th>
                                <th>Id Reparacion</th>                              
                               
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmRepuestoReparacion repuestosR = new AdmRepuestoReparacion();
                               ArrayList<RepuestoReparacion> listaR = repuestosR.listar();
                               for(RepuestoReparacion r:listaR){
                            
                             %>
                             <tr>
                                 <td><%=r.getCodigoRepuesto() %></td>
                                 <td><%=r.getIdReparacion() %></td>                                
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>

        </div>
    </body>
</html>
