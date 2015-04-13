/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iit.sat.itmd4515.jsharma3.mp4.MLM.web;

import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.Customer;
import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.Members;
import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.service.CustomerService;
import edu.iit.sat.itmd4515.jsharma3.mp4.MLM.service.MemberService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jay
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/AdminServlet"})
public class AdminServlet extends HttpServlet {

    @EJB
    private MemberService memberService;
    
    @EJB
    private CustomerService customerService;
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminServlet at " + request.getContextPath() + "</h1>");
             if (request.isUserInRole("admin")) {
                
                Members m = memberService.findByUsername(request.getRemoteUser());
                out.println("<table>");
                out.println("<tr><td><b>First Name</b></td><td><b>Last Name</b></h2></td><td><b>Email</b></td><td><b>Birthdate</b></td><td><b>Referance_Code</b></td><td><b>Points</b></td></tr>");
                out.println("<tr><td>" + m.getFirstName() + "</td><td>" + m.getLastName() + "</td><td>" +m.getEmail() + "</td><td>" + m.getBirthDate() + "</td><td>"+ m.getReferance_code()+"</td><td>" + m.getPnt() + "</td></tr>");
                out.println("</table>");
                
                
               
            }

            out.println("<a href=\"" + request.getContextPath() + "/logout\">Logout</a>");

            out.println("</body>");
            out.println("</html>");
        }
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
