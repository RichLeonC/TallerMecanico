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
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" ></script>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
        <title>Taller Mecanico</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-primary bg-gradient">
  
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
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="../Controlador?accion=Mecanico" target="myFrame">Mecánicos</a>
        </li>
        <li class="nav-item">
          <a style ="margin-left: 10px; border:none" class="btn btn-outline-light" href="../Controlador?accion=Repuesto" target="myFrame">Repuestos</a>
        </li>
        <div class="dropdown">
            <button style ="margin-left: 10px; border:none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
              Reparaciones
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
              <li><a class="dropdown-item"href="../Controlador?accion=Reparacion" target="myFrame">Crear reparación</a></li>
              <li><a class="dropdown-item" href="../Controlador?accion=AsociarM" target="myFrame">Asignar mecánico</a></li>
              <li><a class="dropdown-item" href="#">Anotar repuesto</a></li>
               <li><a class="dropdown-item" href="#">Anotar mano de obra</a></li>
            </div>
        </div>
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
