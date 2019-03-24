/** 
    Document   : YCGSCartServlet.java
    Created on : 2019. 3.20
    Author     : Youngsun Chang
    Observer   : Gyeonglim Seo 
*/
package club.cart;

import club.business.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class YCGSClearCartServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        ServletContext sc = getServletContext();
        
         //access the loanitem object stored in the servlet context
        ArrayList<Book> loanitems = (ArrayList<Book>)sc.getAttribute("loanitem");

        //get cart itmes from session 
         HttpSession session = request.getSession();
         ECart cartItems = (ECart) session.getAttribute("cartItem");

         //Only this job works when Session cart item exist
         if(cartItems!=null){
              ArrayList<Book> cartitem=cartItems.getItems();
             for(int i=0; i<cartitem.size(); i++){
                 ELoan.addToQOH(loanitems, cartitem.get(i).getCode() , cartitem.get(i).getQuantity());
             }
             //Clear session
             session.invalidate();
         }
          response.sendRedirect("YCGSCart");
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
