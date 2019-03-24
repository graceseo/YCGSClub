<%-- 
    Document   : YCGSELoan.jsp
    Created on : 2019. 3. 10,  12:49:03
    Author     : Youngsun Chang
    Observer   : Gyeonglim Seo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/includes/YCGSBanner.jsp" />
<section>
    <h2>Your Loan Cart</h2>
    <table style="border: none;">
        <tr>
            <th>Code</th>
            <th>Description</th>
            <th>Quantity</th> 
        </tr>
             <c:set var="quantityTotal" value="${0}" />
            <c:forEach var="cartitems" items="${cartItem.getItems()}">
                <c:set var="quantityTotal" value="${quantityTotal+cartitems.quantity}" />
                <tr>
                    <td><c:out value="${cartitems.code}" /></td>
                    <td><c:out value="${cartitems.description}" /></td>
                    <td align="right"><c:out value="${cartitems.quantity}" /></td>
                </tr>
            </c:forEach> 
        
        <tr><td colspan="3"></td></tr>
        <tr>
            <td></td>
            <td align="right">Total:</td>
            <td align="right">${quantityTotal}</td>
        </tr> 
    </table>
    
        <h2><a href="YCGSClearCart">Clear the Cart</a></h2>
        <h2><a href="YCGSLoan">Return to eLoan</a></h2>
</section>
 <jsp:include page="/includes/YCGSFooter.jsp" />

