<%-- 
    Document   : Mecanico
    Created on : 10/10/2021, 11:23:27 AM
    Author     : richa
--%>

<%@page import="Modelo.Mecanico"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmMecanicos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">

        <title>Mecánicos</title>
    </head>
    <body>
        <div class="d-flex">
             <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Código</th>
                                <th>Nombre</th>
                                <th>Apellido 1</th>
                                <th>Apellido 2</th>
                                
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmMecanicos mecanicos = new AdmMecanicos();
                               ArrayList<Mecanico> listaMecanicos = mecanicos.listar();
                               for(Mecanico m:listaMecanicos){
                            
                             %>
                             <tr>
                                 <td><%=m.getCodigo() %></td>
                                 <td><%=m.getNombre() %></td>
                                 <td><%=m.getApellido1() %></td>
                                 <td><%=m.getApellido2() %></td>
                                 
                                 <td>
                                     <a class="btn btn-danger" href="Controlador?accion=EliminarM&id=<%=m.getCodigo()%>">Eliminar</a>
                                     
                                 </td>
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>
        </div>
    </body>
</html>
