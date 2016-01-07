package org.apache.jsp.DirectorGeneral;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inicioD_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Principal</title>\r\n");
      out.write("        <link href=\"../css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("        <script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Custom Theme files -->\r\n");
      out.write("        <link href=\"../css/style.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <!-- Custom Theme files -->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <!---- start-smoth-scrolling---->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/easing.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("                jQuery(document).ready(function($) {\r\n");
      out.write("                $(\".scroll\").click(function (event) {\r\n");
      out.write("                    event.preventDefault();\r\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!---- start-smoth-scrolling---->\r\n");
      out.write("        <!----webfonts--->\r\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic,700italic|Oswald:400,300' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <!---//webfonts--->\r\n");
      out.write("        <!----start-top-nav-script---->\r\n");
      out.write("        <script>\r\n");
      out.write("            $(function () {\r\n");
      out.write("                var pull = $('#pull');\r\n");
      out.write("                menu = $('nav ul');\r\n");
      out.write("                menuHeight = menu.height();\r\n");
      out.write("                $(pull).on('click', function (e) {\r\n");
      out.write("                    e.preventDefault();\r\n");
      out.write("                    menu.slideToggle();\r\n");
      out.write("                });\r\n");
      out.write("                $(window).resize(function () {\r\n");
      out.write("                    var w = $(window).width();\r\n");
      out.write("                    if (w > 320 && menu.is(':hidden')) {\r\n");
      out.write("                        menu.removeAttr('style');\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <!----//End-top-nav-script---->\r\n");
      out.write("        <script src=\"../js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                $('#horizontalTab').easyResponsiveTabs({\r\n");
      out.write("                    type: 'default', //Types: default, vertical, accordion           \r\n");
      out.write("                    width: 'auto', //auto or any width like 600px\r\n");
      out.write("                    fit: true   // 100% fit in a container\r\n");
      out.write("                });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!----- start-header---->\r\n");
      out.write("        <div id=\"home\" class=\"header\">\r\n");
      out.write("            <div class=\"top-header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"logo\">\r\n");
      out.write("                        <h1>BIENVENIDO</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!----start-top-nav---->\r\n");
      out.write("                    <nav class=\"top-nav\">\r\n");
      out.write("                        <ul class=\"top-nav\">\r\n");
      out.write("                            <li class=\"active\"><a href=\"#home\" class=\"scroll\">Inicio</a></li>\r\n");
      out.write("                            <li><a href=\"SucursalServlet?accion=consultar\">Sucursales</a></li>\r\n");
      out.write("                            <li><a href=\"ManagerServlet?accion=consultar\">Managers</a></li>\r\n");
      out.write("                            <li><a href=\"#portfolio\">Reportes</a></li>\r\n");
      out.write("                            <li><a href=\"#contact\">Gráficas</a></li>\r\n");
      out.write("                            <li><a href=\"#contact\">Configuración</a></li>\r\n");
      out.write("                            <li><a href=\"#contact\">Cerrar sesión</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                        <a href=\"#\" id=\"pull\"><img src=\"../images/menu-icon.png\" title=\"menu\" /></a>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!----- //End-header---->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"Themes\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"feature-grids\">\r\n");
      out.write("                    <div class=\"col-md-4 feature-grid\">\r\n");
      out.write("                        <h3>Sucursales</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Este tipo de usuario puede realizar varias operaciones, entre éstas están\r\n");
      out.write("                            alta, baja, cambios y consultas sobre las sucursales con las cuales va a contar\r\n");
      out.write("                            la cadena de cine, ingresando su dirección.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"col-md-4 feature-grid\">\r\n");
      out.write("                        <h3>Managers</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Puede realizar las operaciones correspondientes a los managers\r\n");
      out.write("                            de cada una de las sucursales para que éstos lleven la administración\r\n");
      out.write("                            por separado y organicen a sus empleados y las películas que se presentarán.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4 feature-grid\">\r\n");
      out.write("                        <h3>Administración</h3>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            Para llevar a cabo sus tareas puede utilizar herramientas como reportes o\r\n");
      out.write("                            gráficas para facilitar el manejo de información y obtener estadísticas\r\n");
      out.write("                            de las sucursales o managers que administra.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"> </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clearfix\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!---//End-da-features----->\t\r\n");
      out.write("        <!--- portfolio ---->\r\n");
      out.write("        <div id=\"portfolio\" class=\"portfolio\">\r\n");
      out.write("            <div id=\"contact\" class=\"footer\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"col-md-4 footer-grid footer-grid1\">\r\n");
      out.write("                        <div class=\"f-bout\">\r\n");
      out.write("                            <h4>Contáctanos</h4>\r\n");
      out.write("                                 <h5>Correo:</h5>\r\n");
      out.write("                            <h6><a href=\"mailto:alitamonse@hotmail.com\">alitamonse@hotmail.com</a></h6>\r\n");
      out.write("                            <h6><a href=\"mailto:max300394@hotmail.com\">max300394@hotmail.com</a></h6>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4 footer-grid footer-grid3\">\r\n");
      out.write("                        <div class=\"recent-tweet\">\r\n");
      out.write("                            <h4>Síguenos en...</h4>\r\n");
      out.write("                            <div class=\"social\">\t\r\n");
      out.write("                                <ul>\t\r\n");
      out.write("                                    <li><a href=\"#\"><span class=\"alo-icon\"> </span></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"> <span class=\"fb-icon\"> </span></a></li>\t\r\n");
      out.write("                                    <li><a href=\"#\">  <span class=\"t-icon\"> </span></li>\r\n");
      out.write("                                    <li><a href=\"#\"><span class=\"in-icon\"> </span></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"clearfix\"> </div>\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\t\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"bottom\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"copy-right\">\r\n");
      out.write("                        <p>Copyright &copy; 3CV2. All Rights Reserved . Design by Monse Chimal & Max Vázquez</p>\r\n");
      out.write("                    </div>\t\t\t\t\t\t\t\t\r\n");
      out.write("                    <div class=\"clearfix\"> </div>\r\n");
      out.write("                    <script type=\"text/javascript\">\r\n");
      out.write("                        $(document).ready(function () {\r\n");
      out.write("                            /*\r\n");
      out.write("                             var defaults = {\r\n");
      out.write("                             containerID: 'toTop', // fading element id\r\n");
      out.write("                             containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("                             scrollSpeed: 1200,\r\n");
      out.write("                             easingType: 'linear' \r\n");
      out.write("                             };\r\n");
      out.write("                             */\r\n");
      out.write("\r\n");
      out.write("                            $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("                        });\r\n");
      out.write("                    </script>\r\n");
      out.write("                    <a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
