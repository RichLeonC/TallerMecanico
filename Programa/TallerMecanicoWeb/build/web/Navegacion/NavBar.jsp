<%-- 
    Document   : NavBar
    Created on : 10/10/2021, 10:37:03 AM
    Author     : richa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">

        <title>Taller Mecanico</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-info">
  
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a  style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="../Controlador?accion=Cliente" target="myFrame">Clientes</a>
        </li>
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="../Controlador?accion=Vehiculo" target="myFrame">Vehiculos</a>
        </li>
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="#"">Mecanicos</a>
        </li>
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="#"">Repuestos</a>
        </li>
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="#"">Reparaciones</a>
        </li>
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="#"">Facturas</a>
        </li>
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="#"">Consultas</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
        <div class="m-4" style="height: 550px;">
            <iframe name="myFrame" style="height: 100%;width: 100%"></iframe>
            
        </div>
    </body>
</html>
