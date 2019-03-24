<%-- 
    Document   : YCGSDisplayMember
    Created on : 2019. 1. 20
    Author     : Youngsun Chang
    Observer   : Gyeonglim Seo
--%>

<jsp:include page="/includes/YCGSBanner.jsp" />

<!-- start the middle column -->

<section>
<form action="YCGSRegister.jsp" method="post">
     <h1>Thanks for joining our club!</h1>
     <p>Here is the information you entered:</p>
            
            <label class="pad_top">Full Name:</label>
            ${param.fullName} <br>
            <label class="pad_top">Email:</label>
            ${param.email}<br>
            <label class="pad_top">Phone:</label>
            ${param.phone}<br>

            <label class="pad_top">IT Program:</label>
            ${param.program}<br>
            
           <label class="pad_top">Year Level:</label>
            ${param.level}<br>   
            
            <p>To regiter another member, click on the Back button in your browser or the Return button shown below.</p>
            
             <input type="submit" value="Return">
</form>
</section>

<!-- end the middle column -->

<jsp:include page="/includes/YCGSFooter.jsp" />
