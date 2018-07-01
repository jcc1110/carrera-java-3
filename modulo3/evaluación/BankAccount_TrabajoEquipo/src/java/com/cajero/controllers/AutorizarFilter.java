/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajero.controllers;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 *
 * @author pc3
 */


@WebFilter(filterName = "af", urlPatterns = {"/faces/views/private/*"})
public class AutorizarFilter implements Filter {
    
   

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
       
        try{
            // Consulta HTTP
            HttpServletRequest reqt = (HttpServletRequest) request;            
            // Respuesta HTTP
            HttpServletResponse resp = (HttpServletResponse) response;
            // Sesión actual
            HttpSession ses = reqt.getSession(false);            
            // Ruta solicitada
            String reqURI = reqt.getRequestURI();
            
            // Validación de datos
            if (reqURI.contains("/index.xhtml") || 
                    (ses != null && ses.getAttribute("usuario") != null)) {
                chain.doFilter(request, response);
            } else {
                resp.sendRedirect(reqt.getContextPath() + "/faces/index.xhtml");
            }
        } catch (IOException | ServletException e) {
            System.out.println(e.getMessage());
        }
    
    }

    @Override
    public void destroy() { }
}
