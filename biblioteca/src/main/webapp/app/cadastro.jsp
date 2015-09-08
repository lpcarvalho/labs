<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page import="br.com.singularideas.com.biblioteca.dao.LivroRepository"%>
<%@ page import="br.com.singularideas.com.biblioteca.data.Livro"%>
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
				<h3>Livros Cadastrados:</h3>
			<td>
		</tr>
		</table>
		<table style="width: 80%">
		<tr>
			<td> <h4>Titulo</h4> <td>
			<td> <h4>Autor</h4> <td>
			<td> <h4>Local Armazenado</h4> <td>
		</tr>
		<% 	LivroRepository repository = LivroRepository.getInstance();
		    for (Livro lv: repository.getAll()) {
		     int id = repository.getAll().indexOf(lv); %>
		<tr>
			<td> <tt><%=lv.getTitulo()%></tt> <td>
			<td> <tt><%=lv.getAutor()%></tt> <td>
			<td> <tt><%=lv.getLocal()%></tt> <td>
			<td>
					<a href="/biblioteca-web/novolivro?alterar=0">(Alterar Livro)</a>
					<a href="/biblioteca-web/novolivro?excluir=0">(Excluir Livro)</a>
			<td>
		<% 	} %>
		<tr>
			<td>
				<form action="/biblioteca-web/novolivro" method="GET">
                     <input type="submit" value="Novo Livro">
                </form>
                <form action="/biblioteca-web/app/menu.jsp" method="GET">
					<input type="submit" value="voltar">
				</form>
            <td>
       <tr>
	</table>
</body>
</html>