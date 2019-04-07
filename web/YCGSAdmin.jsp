<%-- 
    Document   : YCGSAdmin.jsp
    Created on : 2019. 2.16
    Author     : Gyeonglim Seo 
    Observer   : Youngsun Chang
--%>
<jsp:include page="/includes/YCGSBanner.jsp" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <section>
        <h1> Admin: Data Maintenance</h1>
        <a href="YCGSDisplayBooks">Maintain Books</a><br/>
        
        <!--<form action="displayMembers" method="get">-->
            <a href="<c:url value='/YCGSMemberAdmin?acition=displayMembers'/>">Display Members</a>
        <!--</form>-->
    </section>
 <jsp:include page="/includes/YCGSFooter.jsp" />
