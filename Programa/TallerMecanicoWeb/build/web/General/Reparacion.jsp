<%-- 
    Document   : Reparacion
    Created on : 10/10/2021, 11:24:02 AM
    Author     : richa
--%>

<%@page import="Modelo.Reparacion"%>
<%@page import="Modelo.Cliente"%>
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
        <title>Reparacion</title>
    </head>
    <body>
        <div class="d-flex">
            <div class = "card col-sm-4">
                <div class = "card-body">
                    <form>
                        <div class="form-group">
                            <label>Id</label>
                            <Input type="text" name="txtId" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Placa</label>
                            <Input type="text" name="txtNombre" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Cliente</label>
                            <Input type="text" name="txtApellido1" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Mecánico Lider</label>
                            <Input type="text" name="txtApellido2" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Fecha de Entrada</label>
                            <Input type="text" name="txtDireccion" class="form-control"/>
                        </div>
                         
                        <br/>
                        <input type ="submit" name="accion" value="Agregar" class ="btn btn-primary"/>
                            
                    </form>
                     </div>
                </div>
                <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Placa</th>
                                <th>Cliente</th>
                                <th>Mecánico Lider</th>
                                <th>Fecha de Entrada</th>
                               
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmReparaciones reparaciones = new AdmReparaciones();
                               ArrayList<Reparacion> listaReparaciones = reparaciones.listar();
                               for(Reparacion r:listaReparaciones){
                            
                             %>
                             <tr>
                                 <td><%=r.getId() %></td>
                                 <td><%=r.getPlaca() %></td>
                                 <td><%=r.getCliente() %></td>
                                 <td><%=r.getMecanicoLider() %></td>
                                 <td><%=r.getFechaEntrada() %></td>
                                 
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>

        </div>
    </body>
</html>
