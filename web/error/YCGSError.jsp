<%-- 
    Document   : YCGSError.jsp
    Created on : 2019. 2.16
    Author     : Gyeonglim Seo 
    Observer   : Youngsun Chang
--%>
<jsp:include page="/includes/YCGSBanner.jsp" />

<section>
    <h1>Java Error</h1>
    <p>Sorry, Java has thrown an exception.</p>
    <p>To continue, click the Back button.</p>
    
    <h2>Details</h2>
    <p>Type: ${pageContext.exception["class"]} </p>
        <p>Message:  ${pageContext.exception.message} </p>
</section>

 <jsp:include page="/includes/YCGSFooter.jsp" />