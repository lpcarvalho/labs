<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Consulta Livros</title>
</head>
<body>
<h2>Informe o que quer procurar</h2>
<form action="/webapp1/consultalivro" method="post">
Titulo:<input type="text" name="titulo" size="40">
<br>
Autor: <input type="text" name="autor" size="40">
<br>
<input type="submit" value="Enviar">
</form>

<form action="/webapp1/" method="get">
<br>
<input type="submit" value="voltar">
</form>

</body>
</html>