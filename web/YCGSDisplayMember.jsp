<%-- 
    Document   : YCGSDisplayMember
    Created on : 2019. 4. 6
    Author   : Gyeonglim Seo
    Observer     : Youngsun Chang

--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/includes/YCGSBanner.jsp" />
<section>
<form action="YCGSMemberAdmin" method="get">
     <h1>List of Members</h1>
     <table>
         <thead>
         <th>Email</th>
         <th>Full NAme</th>
         <th>Program</th>
         <th>Year</th>
         <th colspan="2"></th>
         </thead>
            <c:forEach var="member" items="${memberList}">
                <tr>
                    <td><c:out value="${member.emailAddress}" /></td>
                    <td><c:out value="${member.fullName}" /></td>
                    <td><c:out value="${member.programName}" /></td>
                    <td><c:out value="${member.yearLevel}" /></td>
                    <td><a href="<c:url value='/YCGSMemberAdmin?action=editMember&email=${member.emailAddress}'/>">Edit</a>  </td>
                    <td><a href="<c:url value='/YCGSMemberAdmin?action=removeMember&email=${member.emailAddress}'/>">Remove</a></td>
                </tr>
            </c:forEach>             
     </table>
     <input type="hidden" name="action" value="addMember"/>
     <input type="submit" value="Add Member" style="width: 100px; margin-left: 8px; margin-top: 0px">
</form>
</section>

<!-- end the middle column -->

<jsp:include page="/includes/YCGSFooter.jsp" />
