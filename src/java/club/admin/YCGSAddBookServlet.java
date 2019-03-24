/** 
    Document   : YCGSAddBookServlet.java
    Created on : 2019. 2.16
    Author     : Gyeonglim Seo 
    Observer   : Youngsun Chang
*/
package club.admin;
import club.business.*;
import club.data.*;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class YCGSAddBookServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
           BookIO bookIO= new BookIO();
            String url="";
            String message="";
            int quantity=0;
            
            //get parameters from the request
            String code=request.getParameter("code");
            String description=request.getParameter("description");
            
            //If the quantity is blank, default it to 0
            if(request.getParameter("quantity").trim()==null){
               quantity=0;
            }else{
               quantity=Integer.parseInt(  request.getParameter("quantity"));
            }
            //Make a new book instance
            Book book=new Book(code, description, quantity);
            
            // validation check
            if(code==null || "".equals(code)){
                message="Book code is required.<br/>";
            }
            if(description==null ||"".equals(description)|| description.length()<3 ){
                 message+="Description must have at least 3 characters.<br/>";
            }
            if(quantity<=0){
                 message+="Quantity must be a positive number.<br/>";
            }
            
            //if no error, then insert a book
            if(!message.isEmpty()||message==null){
                    url="/YCGSAddBook.jsp";
                   
                    request.setAttribute("message", message);
            
                    request.setAttribute("book", book);
                    getServletContext().getRequestDispatcher(url).forward(request, response);
            }else{
                     //Get a path of books.txt
                    ServletContext sc=this.getServletContext();
                    String path=sc.getRealPath ("/WEB-INF/books.txt");
                    bookIO.insert(book, path);
                    
                    response.sendRedirect("YCGSDisplayBooks");
            }
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
}
