<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer un Compte</title>
</head>
<body>
	<form action="creer_compte">
		<label for="firstName">Firstname</label> <input type="text" name="firstName"><br>
		<label for="lastName">Lastname</label> <input type="text" name="lastName"><br>
		<label for="address">address</label> <input type="text" name="address"><br>
		<label for="postalCode">Code Postal</label> <input type="text" name="postalCode"><br>
		<label for="city">City</label> <input type="text" name="city"><br>
		<label for="phoneNumber">Phone</label> <input type="text" name="phoneNumber"><br>
		<label for="emailAddress">Mail</label> <input type="text" name="emailAddress"><br>
		<label for="login">Login</label> <input type="text" name="login"><br>
		<label for="password">Password</label> <input type="text" name="password"><br>
		<label for="verifPassword">Verif-Password</label> <input type="text" name="verifPassword"><br><br>
		<input type="submit" value="Creer Compte">
	</form>
</body>
</html>