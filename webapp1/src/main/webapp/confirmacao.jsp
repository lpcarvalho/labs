<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livro Incluido</title>
</head>
<body>
<%
final String nome = (String) request.getAttribute ("numLivros");
%>
<h3><%= nome %></h3>

<form action="/webapp1/novolivro" method="get">
<br>
<input type="submit" value="ok">
</form>

</body>
</html>