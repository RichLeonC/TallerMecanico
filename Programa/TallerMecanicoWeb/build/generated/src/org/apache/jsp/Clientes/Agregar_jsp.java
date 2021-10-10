package org.apache.jsp.Clientes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Servlets.Controlador;

public final class Agregar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class = \"container mt-4\">\n");
      out.write("            <div class = \"card\">\n");
      out.write("                <div class = \"card-header\">\n");
      out.write("                    <h5>Agregar nuevo Cliente</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class = \"card-body\">\n");
      out.write("                    <form action=\"../Controlador\">\n");
      out.write("                        <label>Cedula</label>\n");
      out.write("                        <Input type=\"text\" name=\"txtCedula\" class=\"form-control\">\n");
      out.write("                         <label>Nombre</label>\n");
      out.write("                        <Input type=\"text\" name=\"txtNombre\" class=\"form-control\">\n");
      out.write("                         <label>Apellido 1</label>\n");
      out.write("                        <Input type=\"text\" name=\"txtApellido1\" class=\"form-control\">\n");
      out.write("                         <label>Apellido 2</label>\n");
      out.write("                        <Input type=\"text\" name=\"txtApellido2\" class=\"form-control\">\n");
      out.write("                         <label>Direccion</label>\n");
      out.write("                        <Input type=\"text\" name=\"txtDireccion\" class=\"form-control\">\n");
      out.write("                         <label>Telefono</label>\n");
      out.write("                        <Input type=\"text\" name=\"txtTelefono\" class=\"form-control\">\n");
      out.write("                        <input type =\"submit\" name=\"accion\" value=\"Agregar\">\n");
      out.write("                        <a href=\"../Controlador?accion=index\" method=\"doGet\">Regresar</a>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
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
