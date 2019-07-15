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
					<td>
						<form action="commander_pizza">
							<input type="hidden" name="pizza_name" value="${pizza.name}">
							<input type="hidden" name="pizza_price" value="${pizza.price }">
							<input type="submit" value="Commander">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<br>

	<h1>Boissons</h1>

	<br />
	<br />
	<div>
		<table border="1">
			<tr>
				<th>Boisson</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${boissons}" var="boisson">
				<tr>
					<td>${boisson.name}</td>
					<td>${boisson.price}</td>
										<td>
						<form action="commander_boisson">
							<input type="hidden" name="boisson_name" value="${boisson.name}">
							<input type="hidden" name="boisson_price" value="${boisson.price }">
							<input type="submit" value="Commander">
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>