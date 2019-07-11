<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Compte client crée - Pizzeria Miam-Miam</title>
</head>
<body>
	<p>Votre compte client a bien été crée avec ces informations :</p>

	<ul>
		<li>login : ${client.login }</li>
		<li>Prénom : ${client.firstName }</li>
		<li>Nom : ${client.lastName }</li>
		<li>Téléphone : ${client.telephoneNumber }</li>
		<li>Email : ${client.emailAddress }</li>
	</ul>


	<nav>
		<a href="carte">Retour à la carte</a>
	</nav>
</body>
</html>