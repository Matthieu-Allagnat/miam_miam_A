<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter Modifier Supprimer</title>
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
					<td><input type="button" value="Modifier"></td>
					<td><input type="button" value="Supprimer"></td>
				</tr>
			</c:forEach>
		</table>
		<br>

		<form action="ajouter_pizza">
			<input type="submit" value="Ajouter Pizza">
		</form>
	</div>
	<div><br>
	
	<h1>Boissons</h1>

	<br />
	<br />
		<table border="1">
			<tr>
				<th>Boisson</th>
				<th>Price</th>
			</tr>
			<c:forEach items="${boissons}" var="boisson">
				<tr>
					<td>${boisson.name}</td>
					<td>${boisson.price}</td>
					<td><input type="button" value="Modifier"></td>
					<td><input type="button" value="Supprimer"></td>
				</tr>
			</c:forEach>
		</table>
		<br>

		<form action="ajouter_boisson">
			<input type="submit" value="Ajouter Boisson">
		</form>
	</div>
</body>
</html>