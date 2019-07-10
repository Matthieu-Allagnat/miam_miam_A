<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Commandes</h1>

	<br />
	<br />
	<div>
		<table border="1">
			<tr>
				<th>id</th>
				<th>price</th>
				<th>isDelivred</th>
				<th>toDeliver</th>
				<th>Date</th>
				<th>menu</th>
				<th>Pizza</th>
				<th>boisson</th>
			</tr>
			<c:forEach items="${pizzas}" var="pizza">
				<tr>
					<td>${commandes.id}</td>
					<td>${commandes.price}</td>
					<td>${commandes.isDelivred}</td>
					<td>${commandes.toDeliver}</td>
					<td>${commandes.date}</td>
					<td>${commandes.menu}</td>
					<td>${commandes.pizza}</td>
					<td>${commandes.boisson}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>