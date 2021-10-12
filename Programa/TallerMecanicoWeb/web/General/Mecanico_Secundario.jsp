<%-- 
    Document   : Mecanico_Secundario
    Created on : 12/10/2021, 10:33:11 AM
    Author     : richa
--%>

<%@page import="Modelo.MecanicoSecundario"%>
<%@page import="Control.AdmMecanicosSecundarios"%>
<%@page import="Modelo.Reparacion"%>
<%@page import="Control.AdmReparaciones"%>
<%@page import="Modelo.Mecanico"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmMecanicos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" ></script>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
        <title>Asignar Mecanico</title>
    </head>
    <body>
         <div class="d-flex">
            <div class = "card col-sm-4">
                <div class = "card-body">
                    <form>
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
                              <label>Mecanico</label>
                            <select class="form-select" aria-label="Default select example" name ="codigo">                          
                                
                                <% 
                               AdmMecanicos mecanicos = new AdmMecanicos();
                                ArrayList<Mecanico> listaMecanicos = mecanicos.listar();
                                for(Mecanico m:listaMecanicos){
                            
                             %>
                             <option><%=m.getCodigo() %></option>
                             <%}%>
                              </select>
                        </div>         
                        <br/>
                        <button type="submit" name="accion" value="AgregarMS" class ="btn btn-primary">Agregar</button>
                            
                        
                            
                    </form>
                     </div>
                </div>
                <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id Reparacion</th>
                                <th>Mecanico</th>                              
                               
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmMecanicosSecundarios secundarios = new AdmMecanicosSecundarios();
                               ArrayList<MecanicoSecundario> listaS = secundarios.listar();
                               for(MecanicoSecundario s:listaS){
                            
                             %>
                             <tr>
                                 <td><%=s.getIdReparacion() %></td>
                                 <td><%=s.getCodigoMecanico() %></td>                                
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>

        </div>
    </body>
</html>
