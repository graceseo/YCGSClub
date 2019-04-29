/*
    Document   : YCGSMemberAdminController
    Created on : 2019. 4. 6
    Author   : Gyeonglim Seo
    Observer     : Youngsun Chang
 */
package club.admin;

import club.business.Member;
import club.data.*;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class YCGSMemberAdminController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url="";
        String action=request.getParameter("action");
        
        if( action==null ){
                action="displayMembers";
        }
        
        if(action.equals("displayMembers")){
            ArrayList<Member> memberList= MemberDB.selectMembers();
            request.setAttribute("memberList", memberList);
            url="/YCGSDisplayMember.jsp";
            
            //redirect AddMember.jsp for adding a member
        }else if(action.equals("addMember")){
            url="/YCGSAddMember.jsp";
            
            //redirect EditMember.jsp with member information
        }else if(action.equals("editMember")){
            String email=request.getParameter("email");
            Member member= MemberDB.selectMember(email);
            request.setAttribute("member", member);
            url="/YCGSEditMember.jsp";
            
            //redirect RemoveMember.jsp with member information
        }else if(action.equals("removeMember")){
            String email=request.getParameter("email");
            Member member= MemberDB.selectMember(email);
            request.setAttribute("member", member);
            url="/YCGSRemoveMember.jsp";
        }
        
        getServletContext().getRequestDispatcher(url).forward(request, response);  
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //default url
        String url="";

        String action=request.getParameter("action");
        String email=request.getParameter("email");
        
        if(action.equals("saveMember") || action.equals("editMember")){
                    //call saveMember() for checking validation and forward URL
            url=saveMember(request, response);
            getServletContext().getRequestDispatcher(url).forward(request, response);
        }else if(action.equals("deleteMember")){
            Member member=new Member();
            member.setEmailAddress(email);
            MemberDB.delete(member);
            url="/YCGSMemberAdmin?action=displayMember";
             getServletContext().getRequestDispatcher(url).forward(request, response);
        }else{
           response.sendRedirect("YCGSMemberAdmin");
       }
    }
    
    /*
    * Checks validation and executes insert or update statement for database
    */
    private String saveMember(HttpServletRequest request, HttpServletResponse response){
         String url="";
         //String isEdit="";
         int result=0;
         String fullname=request.getParameter("fullName");
         String email=request.getParameter("email");
         String phone=request.getParameter("phone");
         String program=request.getParameter("program");
         String year=request.getParameter("year");
         
          String isEdit=request.getParameter("editing");
          if(isEdit==null||isEdit.isEmpty()){
              isEdit="addting";
          }

        Member member=new Member(fullname,email);
        member.setPhoneNumber(phone);
        member.setProgramName(program);
        member.setYearLevel(Integer.parseInt(year));
        
        if(member.isValid()){
            //if an email exists, update the existing record
                if(MemberDB.emailExists(email)){
                      result=MemberDB.update(member);
                }else{
                     result=MemberDB.insert(member);
                }
            url="/YCGSMemberAdmin?action=displayMember";
            
        }else{
            //if Adding and Editing is not working becuase of invalid input, this method return Addmember.jsp or Editmember.jsp
            if(isEdit.equals("editing")){
                url="/YCGSEditMember.jsp";
                String message="Cannot update record. Please provide a valide name and/or email.";
                request.setAttribute("messsage", message);
                request.setAttribute("member", member);
            }else{
               url="/YCGSAddMember.jsp";
                String message="Cannot insert a new record. Please provide a valide name and/or email.";
                request.setAttribute("messsage", message);
                request.setAttribute("member", member);
            }
        }
        return url;
    }
}
