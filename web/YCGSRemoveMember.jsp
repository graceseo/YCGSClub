<%-- 
    Document   : YCGSRemoveMember.jsp
    Created on : 2019. 4. 7
    Author   : Gyeonglim Seo
    Observer     : Youngsun Chang

--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/includes/YCGSBanner.jsp" />
<section>
        <h1>Edit an Existing Member</h1>
        <p><i style="color:red;">${messsage}</i></p>
         <form action="YCGSMemberAdmin?action=deleteMember" method="post">
            <label class="pad_top">Email</label>
            
            <!-- a disabled field does not send a value to controller -->
            <input type="hidden" value="${member.emailAddress}" name="email"/>
            <input type="email" name="emailDisabled" style="width: 300px" value="${member.emailAddress}"  disabled="disabled"> <br/>
            <label class="pad_top" >Full Name</label>
            <input type="text" name="fullName" style="width: 200px" value="${member.fullName}" disabled="disabled"> <br>
            <label class="pad_top">Phone</label>
            <input type="text" name="phone" style="width: 120px" value="${member.phoneNumber}" disabled="disabled"> <br>

            <label class="pad_top">IT Program</label>
            <input type="text" name="program"  style="width: 50px" value="${member.programName}"  disabled="disabled"> <br>
            
           <label class="pad_top">Year Level</label>
           <input type="text" name="year"  style="width: 50px" value="${member.yearLevel}" disabled="disabled"> <br>
           
            <input type="submit" value="Yes">
     </form>
            <form action="<c:url value='/YCGSMemberAdmin?action=displayMember'/>">
                     <input type="submit" value="No" style="width: 100px; margin-left: 8px; margin-top: 0px">
            </form>
</section>