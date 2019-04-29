<%-- 
    Document   : YCGSEditMember.jsp
    Created on : 2019. 4. 6
    Author   : Gyeonglim Seo
    Observer     : Youngsun Chang

--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/includes/YCGSBanner.jsp" />
<section>
        <h1>Edit an Existing Member</h1>
        <p><i style="color:red;">${messsage}</i></p>
         <form action="YCGSMemberAdmin?action=saveMember" method="post">
            <input type="hidden" name="editing" value="editing"/>
            <label class="pad_top">Email</label>
            
            <input type="hidden" value="${member.emailAddress}" name="email"/>
            <input type="email" name="emailDisabled" style="width: 300px" value="${member.emailAddress}"  disabled="disabled"> <br/>
            <label class="pad_top" >Full Name</label>
            <input type="text" name="fullName" style="width: 200px"value="${member.fullName}" ><br>
            <label class="pad_top">Phone</label>
            <input type="text" name="phone" style="width: 120px"value="${member.phoneNumber}"><br>

            <label class="pad_top">IT Program</label>
            <select name="program" style="width: 80px">
                <option <c:if test="${member.programName=='CAS'}"> selected </c:if> value="CAS">CAS</option>
                <option <c:if test="${member.programName=='SQATE'}"> selected </c:if> value="SQATE">SQATE</option>
                <option <c:if test="${member.programName=='CPA'}"> selected </c:if> value="CPA">CPA</option>
                <option <c:if test="${member.programName=='CP'}"> selected </c:if> value="CP">CP</option>
                <option <c:if test="${member.programName=='ITID'}"> selected </c:if> value="ITID">ITID</option>
                <option <c:if test="${member.programName=='CAD'}"> selected </c:if> value="CAD">CAD</option>
                <option <c:if test="${member.programName=='ITSS'}"> selected </c:if> value="ITSS">ITSS</option>
              </select><br>
            
           <label class="pad_top">Year Level</label>
            <select name="year" style="width: 50px">
                <option  <c:if test="${member.yearLevel==1}"> selected </c:if> value="1">1</option>
                <option  <c:if test="${member.yearLevel==2}"> selected </c:if> value="2">2</option>
                <option  <c:if test="${member.yearLevel==3}"> selected </c:if> value="3">3</option>
                <option  <c:if test="${member.yearLevel==4}"> selected </c:if> value="4">4</option>
            </select><br>
           
            <input type="submit" value="Save">
            <input type="reset" value="Reset">
     </form>
</section>