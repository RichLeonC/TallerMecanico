<%-- 
    Document   : Vehiculo
    Created on : 10/10/2021, 11:23:16 AM
    Author     : richa
--%>

<%@page import="Modelo.Vehiculo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmVehiculos"%>
<%@page import="Control.AdmVehiculos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
                <div class = "card col-sm-4">
                <div class = "card-body">
                    <form>
                        <div class="form-group">
                            <label>Placa</label>
                            <Input type="text" value="${vehiculo.getPlaca()}" name="txtPlaca" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Propietario</label>
                            <Input type="text" name="txtPropietario" value="${vehiculo.getPropietario()}" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Marca</label>
                            <Input type="text" name="txtMarca" value="${vehiculo.getMarca()}" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Modelo</label>
                            <Input type="text" name="txtModelo" value="${vehiculo.getModelo()}" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Año</label>
                            <Input type="text" name="txtAnio" value="${vehiculo.getAnio()}" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Color</label>
                            <Input type="text" name="txtColor" value="${vehiculo.getColor()}" class="form-control"/>
                         </div>
                        <br/>
                        <input type ="submit" name="accion" value="Actualizar" class ="btn btn-success"/>
                            
                    </form>
                     </div>
                </div>
                <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Placa</th>
                                <th>Propietario</th>
                                <th>Marca</th>
                                <th>Modelo</th>
                                <th>Año</th>
                                <th>Color</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmVehiculos vehiculos = new AdmVehiculos();
                               ArrayList<Vehiculo> listaVehiculos = vehiculos.listar();
                               for(Vehiculo v:listaVehiculos){
                            
                             %>
                             <tr>
                                 <td><%=v.getPlaca() %></td>
                                 <td><%=v.getPropietario()%></td>
                                 <td><%=v.getMarca() %></td>
                                 <td><%=v.getModelo() %></td>
                                 <td><%=v.getAnio() %></td>
                                 <td><%=v.getColor() %></td>
                                 <td>
                                     <a class="btn btn-warning" href="Controlador?accion=EditarV&id=<%=v.getPlaca()%>">Editar</a>
                                     
                                 </td>
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>
                
          
      
        </div>
    </body>
</html>
