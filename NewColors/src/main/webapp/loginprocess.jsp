<%-- 
<%@page import="bean.LoginDao"%>
<jsp:useBean id="obj" class="bean.LoginBean"/>
<jsp:setProperty property="*" name="obj"/>

<%
//Object obj2 = new Object(request.getParameter("login"),request.getParameter("pass"));
boolean status=LoginDao.validate(obj);
if(status){
out.println("You'r successfully logged in");
session.setAttribute("session","TRUE");
}
else
{
out.print("Sorry, login or password error");
%>
<jsp:include page="index.jsp"></jsp:include>

<%
}
%>
--%>


<%--
Nowe 
    Document   : validate
    Created on : 28 Feb, 2015, 8:50:26 AM
    Author     : Lahaul Seth
--%>

<%@ page import ="java.sql.*" %>
<%
    try{
        String username = request.getParameter("username");   
        String password = request.getParameter("password");
        String jdbcURL = "jdbc:derby://localhost:1527/newcolor";
        Connection conn = DriverManager.getConnection(jdbcURL);
        
        /*
        PreparedStatement pst = conn.prepareStatement("SELECT login,password FROM LogPass WHERE login=? and password=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();    */
        /*
        Statement statement = conn.createStatement();         
        ResultSet rs= statement.executeQuery("SELECT * FROM LogPass WHERE login='Ann' and password='WMD24FPH8SB'");
        
        if(rs.next())           
           out.println("Valid login credentials");        
        else
           out.println("Invalid login credentials");   */         
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>