package com.ipn.mx.controlador;

import com.ipn.mx.clases.Delegacionmunicipio;
import com.ipn.mx.clases.Entidadfederativa;
import com.ipn.mx.clases.Sucursal;
import com.ipn.mx.modelo.SucursalDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Max
 */
public class SucursalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
	//meter en switch
	if(accion.equals("listaDeSucursales")){
            listaDeSucursales(request,response);
	}else{
            if(accion.equals("nuevo")){
                agregarSucursal(request,response);
            }else{
                if(accion.equals("eliminar")){
                    eliminarSucursal(request,response);
                }else{
                    if(accion.equals("actualizar")){
                        actualizarSucursal(request,response);
                    }
                }
            }
	}
    }
    
    private void listaDeSucursales(HttpServletRequest request, HttpServletResponse response) {
        try{	
            SucursalDAO d = new SucursalDAO();
            request.setAttribute("listaDeSucursales", d.readAll());
            RequestDispatcher vista = request.getRequestDispatcher("../sucursales.jsp");
            vista.forward(request,response);
	}catch(ServletException | IOException e){
	}
    }
    
    private void agregarSucursal(HttpServletRequest request, HttpServletResponse response) {
        SucursalDAO d = new SucursalDAO();
        Sucursal s = new Sucursal();
        Entidadfederativa entidad = new Entidadfederativa(request.getParameter("txtEntidad"));
        Delegacionmunicipio del = new Delegacionmunicipio(entidad, request.getParameter("txtDelegacion"));

        s.setNombreSucursal(request.getParameter("txtNombre"));
        s.setCalle(request.getParameter("txtCalle"));
        s.setNumero(Integer.parseInt(request.getParameter("txtNum")));
        s.setCodigoPostal(request.getParameter("txtCP"));
        s.setColonia(request.getParameter("txtColonia"));
        s.setDelegacionmunicipio(del);
        d.create(s);
        listaDeSucursales(request, response);
    }
    
    private void eliminarSucursal(HttpServletRequest request, HttpServletResponse response) {
        SucursalDAO d = new SucursalDAO();
        Sucursal s = new Sucursal();
        s.setIdSucursal(Integer.parseInt(request.getParameter("id")));
        d.delete(s);
        listaDeSucursales(request, response);
    }
    
    private void actualizarSucursal(HttpServletRequest request, HttpServletResponse response) {
        SucursalDAO d = new SucursalDAO();
        Sucursal s = new Sucursal();
        Entidadfederativa entidad = new Entidadfederativa(request.getParameter("txtEntidad"));
        Delegacionmunicipio del = new Delegacionmunicipio(entidad, request.getParameter("txtDelegacion"));
        
        s.setIdSucursal(Integer.parseInt(request.getParameter("id")));
        d.read(s);
        s.setNombreSucursal(request.getParameter("txtNombre"));
        s.setCalle(request.getParameter("txtCalle"));
        s.setNumero(Integer.parseInt(request.getParameter("txtNumero")));
        s.setCodigoPostal(request.getParameter("txtCP"));
        s.setColonia(request.getParameter("txtColonia"));
        s.setDelegacionmunicipio(del);
        d.update(s);        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
