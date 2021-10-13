<%-- 
    Document   : ManoObra_Reparacion
    Created on : 12/10/2021, 05:47:48 PM
    Author     : richa
--%>

<%@page import="Modelo.ManoReparacion"%>
<%@page import="Control.AdmManoReparaciones"%>
<%@page import="Modelo.Reparacion"%>
<%@page import="Control.AdmReparaciones"%>
<%@page import="Modelo.ManoObra"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmObras"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" ></script>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
        <title>Mano Obra</title>
    </head>
    <body>
        <div class="d-flex">
            <div class = "card col-sm-4">
                <div class = "card-body">
                    <form>
                        <div class="form-group">
                            <label>Codigo Mano de Obra</label>
                            <select class="form-select" aria-label="Default select example" name ="codObra">                          
                                
                                <% 
                               AdmObras obras = new AdmObras();
                               ArrayList<ManoObra> listaObras = obras.listar();
                               for(ManoObra m:listaObras){
                            
                             %>
                             <option><%=m.getCodigo() %></option>
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
                        <button type="submit" name="accion" value="AgregarMR" class ="btn btn-primary">Agregar</button>
                            
                        
                            
                    </form>
                     </div>
                </div>
                <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Codigo de Mano de Obra</th>
                                <th>Id Reparacion</th>                              
                               
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmManoReparaciones obrasR = new AdmManoReparaciones();
                               ArrayList<ManoReparacion> listaM = obrasR.listar();
                               for(ManoReparacion r:listaM){
                            
                             %>
                             <tr>
                                 <td><%=r.getCodigoObra() %></td>
                                 <td><%=r.getIdReparacion() %></td>                                
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>

        </div>
    </body>
</html>
