<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizza commandée - Pizzeria Miam-Miam</title>
</head>
<body>
<p>
Vous avez commandé une pizza : <br>

Nom :	${commande.pizza}
Prix :	${commande.price}
<br>
TODO: Envoyer/récupérer l'objet commande au niveau Session
<p>
<nav><a href="carte">Retour à la carte</a></nav>
</body>
</html>