<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entrada" var="linkEntradaServlet"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="${linkEntradaServlet }" method="post">
   <h3>LOGIN</h3><input type="text"  name="login" />
   <h3>SENHA</h3><input type="password"  name="senha"/>
   <input type="hidden" name="acao" value="Login"></br>
   <input type="submit"/>   
   </form>
</body>
</html>