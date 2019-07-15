<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Persistence commande</title>
</head>
<body>
<p>
Commande passée :
	<br>
	Price : ${commande.price }
	<br>
	Pizza : ${commande.pizza }
	<br>
	Boisson : ${commande.boisson}
</p>
<nav>
<a href="panier_client">Retour panier</a> </nav>
</body>
</html>