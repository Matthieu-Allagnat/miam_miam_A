<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Votre panier - Pizzeria Miam-Miam</title>
</head>
<body>
	<h1>//Créateur commande pour test persistance</h1>

	<form action="persistence_commande">

		<label for="price">Price</label> <input type="number" name="price"
			step="0.01"><br> <input type="radio" name="toDeliver"
			value="false">A emporter<br> <input type="radio"
			name="toDeliver" value="true"> Livraison<br> <label
			for="pizza">Pizza</label> <input type="text" name="pizza"><br>
		<label for="boisson">Boisson</label> <input type="text" name="boisson"><br>
		<input type="submit" value="Ajouter Commande">
	</form>

</body>
</html>