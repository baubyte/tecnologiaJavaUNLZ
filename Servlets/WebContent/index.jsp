<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hola mundo</title>
</head>
<body>


	Nombre: <%= request.getAttribute("nombre") %><br/>
	Apellido: <%= request.getAttribute("apellido") %><br/>
		Apellido: <%= request.getAttribute("segundonombre") %><br/>
	<%= request.getParameter("param") %>

</body>
</html>