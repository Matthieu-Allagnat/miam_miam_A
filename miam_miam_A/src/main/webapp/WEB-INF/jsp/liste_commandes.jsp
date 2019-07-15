<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste commandes</title>
</head>
<body>
	<h1>Commandes</h1>
	<h2>//Note : doesn't actually read from the database</h2>
	<br />
	<br />
	<div>
		
		<table border="1">
			<tr>
				<th>Numero</th>
				<th>price</th>
				<th>isDelivred</th>
				<th>toDeliver</th>
				<th>Date</th>
				<th>menu</th>
				<th>Pizza</th>
				<th>Boisson</th>
			</tr>
			<c:forEach items="${commandes}" var="commande">
				<tr>
					<td>${commande.id}</td>
					<td>${commande.price}</td>
					<td>${commande.isDelivered}</td>
					<td>${commande.toDeliver}</td>
					<td>${commande.dateTime}</td>
					<td>${commande.menu}</td>
					<td>${commande.pizza}</td>
					<td>${commande.boisson}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>