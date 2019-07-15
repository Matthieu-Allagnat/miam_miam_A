<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Boisson commandée - Pizzeria Miam-miam</title>
</head>
<body>
<p>
Vous avez commandé une boisson : <br>

Nom :	${commande.boisson}
Prix :	${commande.price}
<br>
TODO: Envoyer/récupérer l'objet commande au niveau Session
<p>
<nav><a href="carte">Retour à la carte</a></nav>
</body>
</html>