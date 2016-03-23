<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Biblioteca Lulu & Lele</title>
</head>
<body>
	<table style="width: 100%">
		<tr>
			<td><h2>Biblioteca</h2></td>
			<td align="Right" >Ola <%=request.getSession().getAttribute("user")%> ! (<a href="/biblioteca-web/login?invalidate">logoff</a>)</td>
		</tr>
		<tr>
			<td>
				<ul>
					<li><a href="/biblioteca-web/livros">Lista Livros </a></li>
					<li><a href="/biblioteca-web/novolivro"> Novo Livro</a></li>
					<li><a href="/biblioteca-web/consultalivro"> Consulta Livro</a></li>
				</ul>
			<td>
		</tr>
	</table>
</body>
</html>