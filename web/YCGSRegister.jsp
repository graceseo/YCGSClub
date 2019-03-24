<%-- 
    Document   : YCGSRegister
    Created on : 2019. 1. 20
    Author     : Youngsun Chang
    Observer   : Gyeonglim Seo
--%>

<jsp:include page="/includes/YCGSBanner.jsp" />

<!-- start the middle column -->

<section>
 <form action="YCGSDisplayMember.jsp" method="post">
     <h1>New Member Registration Form</h1>
            
            <label class="pad_top" >Full Name</label>
            <input type="text" name="fullName" style="width: 200px" required><br>
            <label class="pad_top">Email</label>
            <input type="email" name="email" style="width: 300px" required><br>
            <label class="pad_top">Phone</label>
            <input type="text" name="phone" style="width: 120px"><br>

            <label class="pad_top">IT Program</label>
            <select name="program" style="width: 80px">
                <option value="CAS">CAS</option>
                <option value="SQATE">SQATE</option>
                <option value="CPA">CPA</option>
                <option value="CP">CP</option>
                <option value="ITID">ITID</option>
                <option value="CAD">CAD</option>
                <option value="ITSS">ITSS</option>
              </select><br>
            
           <label class="pad_top">Year Level</label>
            <select name="level" style="width: 50px">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
            </select><br>
           
            <input type="submit" value="Register Now!">
            <input type="reset" value="Reset">
 </form>
</section>

<!-- end the middle column -->

<jsp:include page="/includes/YCGSFooter.jsp" />
