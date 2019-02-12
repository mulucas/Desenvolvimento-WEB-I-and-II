<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% aula05.Contador.novoAcesso(); %>	Quantidade de acessos a essa página:
	<b>
		<%= aula05.Contador.getQuantidadeAcessos() %>
	</b>
</body>
</html>