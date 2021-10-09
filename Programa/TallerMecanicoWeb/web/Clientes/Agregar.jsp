<%-- 
    Document   : Agregar
    Created on : 8/10/2021, 12:25:27 PM
    Author     : richa
--%>
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
        <div class = "container mt-4">
            <div class = "card">
                <div class = "card-header">
                    <h5>Agregar nuevo Cliente</h5>
                </div>
                <div class = "card-body">
                    <form action="Controlador">
                        <label>Cedula</label>
                        <Input type="text" name="txtCedula" class="form-control">
                         <label>Nombre</label>
                        <Input type="text" name="txtNombre" class="form-control">
                         <label>Apellido 1</label>
                        <Input type="text" name="txtApellido1" class="form-control">
                         <label>Apellido 2</label>
                        <Input type="text" name="txtApellido2" class="form-control">
                         <label>Direccion</label>
                        <Input type="text" name="txtDireccion" class="form-control">
                         <label>Telefono</label>
                        <Input type="text" name="txtTelefono" class="form-control">
                        <input type ="submit" name="accion" value="Agregar"
                         <button href="Controlador?accion=index.jsp">Regresar</button>
                    </form>
                </div>
                
            </div>
        </div>
    </body>
</html>
