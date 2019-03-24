/**
    Document   : YCGSDisplayBooksServlet.java
    Created on : 2019. 1. 20
    Author     :  Gyeonglim Seo 
    Observer : Youngsun Chang
*/
package club.admin;

import club.data.*;
import club.business.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.ServletContext;


public class YCGSDisplayBooksServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            //Forward url
            String url="/YCGSDisplayBooks.jsp";
            
            //Get a path of books.txt
            ServletContext sc=this.getServletContext();
            String path=sc.getRealPath ("/WEB-INF/books.txt");
            
            //Create BookIO instance 
            BookIO book= new BookIO();
            
            //Put books data into ArrayList
           ArrayList<Book> books = book.getBooks(path); 
            
            request.setAttribute("book", books);
            
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
    }// </editor-fold>

}
