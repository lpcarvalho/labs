<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Biblioteca Lulu & Lele</title>
</head>
<body>
<%  String pValue = request.getParameter("alterar").toString();  
	String param = "";
	if (pValue != null)
		param = "?alterar="+ pValue;
%>
<h2>Formulario de Inclusao / Alteracao</h2>
<form action="/biblioteca-web/novolivro<%=param%>" method="POST">
Titulo:<input type="text" name="titulo" size="40" value="<%=request.getAttribute("tituloatual") %>">
<br>
Autor: <input type="text" name="autor" size="40" value="<%=request.getAttribute("autoratual") %>">
<br>
Local Armazenado: <input type="text" name="local" size="40" value="<%=request.getAttribute("localatual") %>">
<br>
<input type="submit" value="Salvar">
</form>

<form action="/biblioteca-web/livros" method="GET">
<br>
<input type="submit" value="voltar">
</form>

</body>
</html>
