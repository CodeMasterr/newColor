<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewColor_CodeChallange</title>
</head>
<body>
<p>
<center> Login Page</center>
</p>

  <form method = "get" action="loginprocess.jsp">
	Login:<input type="text" name="login" required/><br/><br/>
	Password:<input type="password" name="pass" required/><br/><br/>
		<input type="submit" value="login"/>
</form>
</body>
</html>
--%>

<%-- 
    Document   : Login
    Created on : 28 Feb, 2015, 8:50:26 AM
    Author     : Lahaul Seth
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Demo with JSP</title>
    </head>
    <body>
        <form method="post" action="loginprocess.jsp">
            <center>
            <table border="1" cellpadding="5" cellspacing="2">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Username</td>
                        <td><input type="text" name="username" required/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" required/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="Login" />
                            <input type="reset" value="Reset" />
                        </td>                        
                    </tr>                    
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>