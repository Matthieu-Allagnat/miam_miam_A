<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Carte</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
	<h1>Pizzas</h1>

	<br />
	<br />
	<div>
		<table border="1">
			<tr>
				<th>Pizza</th>
				<th>Size</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${pizzas}" var="pizza">
				<tr>
					<td>${pizza.name}</td>
					<td>${pizza.size}</td>
					<td>${pizza.price}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>