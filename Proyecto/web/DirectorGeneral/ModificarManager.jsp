<%-- 
    Document   : index
    Created on : 5/01/2016, 04:23:09 PM
    Author     : Max
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Modificar manager</title>
        <link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="../js/jquery.min.js"></script>
        <!-- Custom Theme files -->
        <link href="../css/style.css" rel='stylesheet' type='text/css' />
        <!-- Custom Theme files -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    </script>
    <!---- start-smoth-scrolling---->
    <script type="text/javascript" src="../js/move-top.js"></script>
    <script type="text/javascript" src="../js/easing.js"></script>

    <script type="text/javascript">
            jQuery(document).ready(function($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
            });
        });
    </script>
    <!---- start-smoth-scrolling---->
    <!----webfonts--->
    <link href='//fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic,700italic|Oswald:400,300' rel='stylesheet' type='text/css'>
    <!---//webfonts--->
    <!----start-top-nav-script---->
    <script>
        $(function () {
            var pull = $('#pull');
            menu = $('nav ul');
            menuHeight = menu.height();
            $(pull).on('click', function (e) {
                e.preventDefault();
                menu.slideToggle();
            });
            $(window).resize(function () {
                var w = $(window).width();
                if (w > 320 && menu.is(':hidden')) {
                    menu.removeAttr('style');
                }
            });
        });
    </script>
    <!----//End-top-nav-script---->
    <script src="../js/easyResponsiveTabs.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $('#horizontalTab').easyResponsiveTabs({
                type: 'default', //Types: default, vertical, accordion           
                width: 'auto', //auto or any width like 600px
                fit: true   // 100% fit in a container
            });
        });
    </script>
</head>
<body>
    <!----- start-header---->
    <div id="home" class="header">
        <div class="top-header">
            <div class="container">
                <div class="logo">
                    <h1>Modificar</h1>
                </div>
                <!----start-top-nav---->
                <div class="clearfix"> </div>
            </div>
        </div>
    </div>
    <!----- //End-header---->
    
    <div class="Themes">
        <div class="container">
            <div class="feature-grids">
                <form method="post" action="InicioSesionServlet">
                    <div class="col-md-4 feature-grid">
                        <h3>Nombre:</h3>
                        <p><input type="text" name="txtNombre" value="${manager.nombre}" required/></p>
                        <h3>Apellido Paterno:</h3>
                        <p><input type="text" name="txtApPaterno value="${manager.apPaterno}" required/></p>
                        <h3>Apellido Materno:</h3>
                        <p><input type="text" name="txtApMaterno" value="${manager.apMaterno}" required/></p>
                        <h3>Correo:</h3>
                        <p><input type="text" name="txtCorreo" value="${manager.email}" required/></p>
                        <h3>Contrasenia:</h3>
                        <p><input type="text" name="txtContrasena" value="${manager.contrasena}" required/></p>
                    </div>
                    <div class="col-md-4 feature-grid">
                        <h3>Sucursal:</h3>
                        <p><input type="text" name="txtSucursal" value="${manager.sucursal}" required/></p>
                        <h3>Salario:</h3>
                        <p><input type="text" name="txtSalario" value="${manager.salario}" required/></p>
                        <h3>Género:</h3>
                        <p><input type="text" name="txtGenero" value="${manager.genero}" required/></p>
                        <h3>Edad:</h3>
                        <p><input type="text" name="txtEdad" value="${manager.edad}" required/></p>
                        <br><div class="button"><span><a href="#">Registrar sucursal</a></span></div>
                    </div>
                </form>
                <div class="clearfix"> </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div class="clearfix"> </div>
    </div>
    <!---//End-da-features----->	
    <!--- portfolio ---->
    <div id="portfolio" class="portfolio">
        <div id="contact" class="footer">
            <div class="container">
                <div class="col-md-4 footer-grid footer-grid1">
                    <div class="f-bout">
                        <h4>Contáctanos</h4>
                             <h5>Correo:</h5>
                        <h6><a href="mailto:alitamonse@hotmail.com">alitamonse@hotmail.com</a></h6>
                        <h6><a href="mailto:max300394@hotmail.com">max300394@hotmail.com</a></h6>
                    
                    </div>
                </div>
                <div class="col-md-4 footer-grid footer-grid3">
                    <div class="recent-tweet">
                        <h4>Síguenos en...</h4>
                        <div class="social">	
                            <ul>	
                                <li><a href="#"><span class="alo-icon"> </span></a></li>
                                <li><a href="#"> <span class="fb-icon"> </span></a></li>	
                                <li><a href="#">  <span class="t-icon"> </span></li>
                                <li><a href="#"><span class="in-icon"> </span></a></li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>	
                    </div>
                </div>
                <div class="clearfix"> </div>	
            </div>
        </div>
        <div class="bottom">
            <div class="container">
                <div class="copy-right">
                    <p>Copyright &copy; 3CV2. All Rights Reserved . Design by Monse Chimal & Max Vázquez</p>
                </div>								
                <div class="clearfix"> </div>
                <script type="text/javascript">
                    $(document).ready(function () {
                        /*
                         var defaults = {
                         containerID: 'toTop', // fading element id
                         containerHoverID: 'toTopHover', // fading element hover id
                         scrollSpeed: 1200,
                         easingType: 'linear' 
                         };
                         */

                        $().UItoTop({easingType: 'easeOutQuart'});

                    });
                </script>
                <a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
            </div>
        </div>
    </body>
</html>
