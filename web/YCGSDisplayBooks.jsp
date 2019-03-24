<%-- 
    Document   : YCGSDisplayBooks.jsp
    Created on : 2019. 2.16
    Author     : Gyeonglim Seo 
    Observer   : Youngsun Chang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/includes/YCGSBanner.jsp" />
<section>
    <h1>List of Books</h1>
    <table>
        <th >Code</th>
        <th>Description</th>
        <th>Quantity</th> 
            <c:forEach var="book" items="${book}">
                <tr>
                    <td><c:out value="${book.code}" /></td>
                    <td><c:out value="${book.description}" /></td>
                    <td><c:out value="${book.quantity}" /></td>
                </tr>
            </c:forEach> 
    </table>
    
    <form action="<c:url value='/YCGSAddBook.jsp'/>">
        <input type="submit" value="Add Book" style="width: 100px; margin-left: 8px; margin-top: 0px">
    </form>
</section>
 <jsp:include page="/includes/YCGSFooter.jsp" />