<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Biblioteca Lulu & Lele</title>
</head>
<body>
<h3>Login</h3>

<%
if (request.getAttribute("message") != null) {
%>
<hr>
<h5><%=request.getAttribute("message") %></h5>
<hr>
<%	
}
%>

<form action="<%=request.getContextPath() %>/login" method="POST">
Username:<input type="text" name="user" size="10">
<br>
Senha  : <input type="password" name="password" size="10">
<br>
<input type="submit" value="Login">
</form>

</body>
</html>