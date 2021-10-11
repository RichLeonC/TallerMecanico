<%-- 
    Document   : Repuesto
    Created on : 10/10/2021, 11:23:40 AM
    Author     : richa
--%>

<%@page import="Modelo.Repuesto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmRepuestos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">

        <title>Repuestos</title>
    </head>
    <body>
        <div class="d-flex">
             <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Código</th>
                                <th>Nombre</th>
                                <th>Precio</th>                               
                                
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmRepuestos repuestos = new AdmRepuestos();
                               ArrayList<Repuesto> listaRepuestos = repuestos.listar();
                               for(Repuesto r:listaRepuestos){
                            
                             %>
                             <tr>
                                 <td><%=r.getCodigo() %></td>
                                 <td><%=r.getNombre() %></td>
                                 <td><%=r.getPrecio() %></td>
                               
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>
        </div>
    </body>
</html>
