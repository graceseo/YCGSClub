<%-- 
    Document   : YCGSAddBook.jsp
    Created on : 2019. 2.16
    Author     : Gyeonglim Seo 
    Observer   : Youngsun Chang
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/includes/YCGSBanner.jsp" />
<section>
    <h1>Add a Book</h1>
    <p style="color: red">${message}</p>
    
    <form  action="YCGSAddBook" method="post">
        <label for="code" >Code: </label>
        <input type="text"  name="code" value="${book.code}" style="width: 100px"><br>
        <label for="description" >Description:  </label>
        <input type="text"  name="description" value="${book.description}" style="width: 200px"><br>
        <label for="quantity" >Quantity:  </label>
        <input type="text"  name="quantity" value="${book.quantity}" style="width: 60px" ><br> 
        <input type="submit" value="Save" style="width:60px; margin-left: 118px;  margin-left: 0px">
        <input type="submit" value="cancel" formaction="YCGSDisplayBooks" method="post" style="width: 60px; margin-left: 0px">
    </form>
</section>
 <jsp:include page="/includes/YCGSFooter.jsp" />