/** 
    Document   : YCGSCartServlet.java
    Created on : 2019. 3.10
    Author     : Youngsun Chang
    Observer   : Gyeonglim Seo 
*/
package club.cart;

import club.business.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class YCGSCartServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
                //Forward url
        String url="/YCGSECart.jsp";   
        ServletContext sc = getServletContext();
        
         //access the loanitem object stored in the servlet context
        ArrayList<Book> loanitems = (ArrayList<Book>)sc.getAttribute("loanitem");

        //get cart itmes from session 
         HttpSession session = request.getSession();
         ECart cartItems = (ECart) session.getAttribute("cartItem");

         //check there is a cart item
         if(cartItems==null){
             cartItems= new ECart();
         }
        // get current action
        String action = request.getParameter("action");
        
         if("reserve".equals(action)){
             //Get details of the loan item
            String code=request.getParameter("code").toString();
            Book books=ELoan.findItem(loanitems, code);

             //add item on cart
            cartItems.addItem(books);
            
            //Reduce the loan item's OOH by1 
            ELoan.subtractFromQOH(loanitems,code, 1);
          }
            session.setAttribute("cartItem",cartItems);
            request.setAttribute("cartItem",cartItems);
            
            sc.setAttribute("loanitem", loanitems);
        getServletContext().getRequestDispatcher(url).forward(request, response);                  
    }
         
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }       
}
