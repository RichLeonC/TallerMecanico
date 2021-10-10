<%-- 
    Document   : index
    Created on : 8/10/2021, 11:36:37 AM
    Author     : richa
--%>

<%@page import="Modelo.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Control.AdmClientes"%>
<%@page import="Servlets.Controlador"%>
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
                            <label>Cédula</label>
                            <Input type="text" name="txtCedula" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Nombre</label>
                            <Input type="text" name="txtNombre" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Apellido1</label>
                            <Input type="text" name="txtApellido1" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Apellido2</label>
                            <Input type="text" name="txtApellido2" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Dirección</label>
                            <Input type="text" name="txtDireccion" class="form-control"/>
                        </div>
                         <div class="form-group">
                            <label>Telefono</label>
                            <Input type="text" name="txtTelefono" class="form-control"/>
                         </div>
                        <br/>
                        <input type ="submit" name="accion" value="Agregar" class ="btn btn-info"/>
                            
                    </form>
                     </div>
                </div>
                <div class = "col-sm-8">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Cédula</th>
                                <th>Nombre</th>
                                <th>Apellido1</th>
                                <th>Apellido2</th>
                                <th>Dirección</th>
                                <th>Telefono</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% 
                               AdmClientes clientes = new AdmClientes();
                               ArrayList<Cliente> listaClientes = clientes.listar();
                               for(Cliente c:listaClientes){
                            
                             %>
                             <tr>
                                 <td><%=c.getCedula()%></td>
                                 <td><%=c.getNombre()%></td>
                                 <td><%=c.getApellido() %></td>
                                 <td><%=c.getApellido2() %></td>
                                 <td><%=c.getDireccion() %></td>
                                 <td><%=c.getTelefono() %></td>
                             </tr>
                             <%}%>
                        </tbody>
                      </table>
                </div>
                
          
      
        </div>
        
    </body>
</html>
