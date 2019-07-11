<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>liste clients</title>
</head>
<body>
	<h1>Clients</h1>

	<br />
	<br />
	<div>
		
		<table border="1">
			<tr>
				<th>Numero_client</th>
				<th>Firstname</th>
				<th>Lastname</th>
				<th>Login</th>
				<th>Password</th>
				<th>Verifpassword</th>
				<th>Postal code</th>
				<th>Address</th>
				<th>City</th>
				<th>Telephone</th>
				<th>E-mail</th>
				<th>Numero commande</th>
			</tr>
			<c:forEach items="${clients}" var="client">
				<tr>
					<td>${client.id}</td>
					<td>${client.firstName}</td>
					<td>${client.lastName}</td>
					<td>${client.login}</td>
					<td>${client.password}</td>
					<td>${client.verifPassword}</td>
					<td>${client.postalCode}</td>
					<td>${client.address}</td>
					<td>${client.city}</td>
					<td>${client.telephoneNumber}</td>
					<td>${client.emailAddress}</td>
					<td>${client.numeroCommande}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>