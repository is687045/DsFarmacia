<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.dsfarmacia.login.Login"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%
		Login p = new Login(); 
	%>

	<ul>
<li><p><b>First Name:</b>
   <%String user= request.getParameter("Username");%>
</p></li>
<li><p><b>Last  Name:</b>
   <%String pass= request.getParameter("Password");%>
</p></li>
</ul>
	<%String salida=p.Connect(user, pass);
	%>
	<%=salida %>
	
</body>
</html>