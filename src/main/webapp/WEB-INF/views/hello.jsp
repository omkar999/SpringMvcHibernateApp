<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h3>Hello...Welcome to SpringMVC XML Based Config App</h3>


<c:forEach items="${products}" var="product" varStatus="count">
	<c:forEach items="${product.prices}" var="price">
		<p>${price.value}</p>
	</c:forEach>

</c:forEach>

</body>
</html>