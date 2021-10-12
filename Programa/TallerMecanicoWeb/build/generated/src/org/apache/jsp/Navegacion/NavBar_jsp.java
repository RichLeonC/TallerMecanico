package org.apache.jsp.Navegacion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NavBar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" ></script>\n");
      out.write("         <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js\" integrity=\"sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Taller Mecanico</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-primary bg-gradient\">\n");
      out.write("  \n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("      <ul class=\"navbar-nav\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light\" aria-current=\"page\" href=\"#\">Home</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a  style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light\" href=\"../Controlador?accion=Cliente\" target=\"myFrame\">Clientes</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light\" href=\"../Controlador?accion=Vehiculo\" target=\"myFrame\">Vehiculos</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light\" href=\"../Controlador?accion=Mecanico\" target=\"myFrame\">Mecánicos</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light\" href=\"../Controlador?accion=Repuesto\" target=\"myFrame\">Repuestos</a>\n");
      out.write("        </li>\n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("            <button style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("              Reparaciones\n");
      out.write("            </button>\n");
      out.write("            <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton1\">\n");
      out.write("              <li><a class=\"dropdown-item\"href=\"../Controlador?accion=Reparacion\" target=\"myFrame\">Crear reparación</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"#\">Asignar mecánico</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"#\">Anotar repuesto</a></li>\n");
      out.write("               <li><a class=\"dropdown-item\" href=\"#\">Anotar mano de obra</a></li>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light\" href=\"#\"\">Facturas</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a style =\"margin-left: 10px; border:none\" class=\"btn btn-outline-light\" href=\"#\"\">Consultas</a>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <div class=\"m-4\" style=\"height: 550px;\">\n");
      out.write("            <iframe name=\"myFrame\" style=\"height: 100%;width: 100%\"></iframe>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
