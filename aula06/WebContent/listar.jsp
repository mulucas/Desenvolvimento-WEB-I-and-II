<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.List" %>
<%@ page import="aula06.Encontro" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Lista de encontros:</h3>
	<table border="1">
		<tr>
			<td>Nome</td>
			<td>Local</td>
			<td>Motivo</td>
			<td>Data</td>
		</tr>
		<%
			List<Encontro> lista = (List<Encontro>) request.getAttribute("lista");
			for (Encontro encontro : lista) {
		%>
		<tr>
			<td><%=encontro.getNomePessoa()%></td>
			<td><%=encontro.getLocal()%></td>
			<td><%=encontro.getMotivo()%></td>
			<td><%=encontro.getData().toLocaleString()%></td>
			<td> <a href="ServletControlador?acao=remover"> remover</a></td>
			<td> <a href="ServletControlador?acao=alterar"> alterar</a></td>
		</tr>
		<%
			}
		%>
	</table>
	<BR>
	<BR>
	<a href="ServletControlador">Voltar ao menu</a>
</body>
</html>