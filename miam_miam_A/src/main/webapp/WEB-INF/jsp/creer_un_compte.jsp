<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer un Compte</title>
</head>
<body>
	<form action="creation_compte_client">
		<label for="firstName">Firstname</label> <input type="text" name="firstName"><br>
		<label for="lastName">Lastname</label> <input type="text" name="lastName"><br>
		<label for="address">address</label> <input type="text" name="address"><br>
		<label for="cp">Code Postal</label> <input type="text" name="cp"><br>
		<label for="city">City</label> <input type="text" name="city"><br>
		<label for="phone">Phone</label> <input type="text" name="phone"><br>
		<label for="mail">Mail</label> <input type="text" name="mail"><br>
		<label for="login">Login</label> <input type="text" name="login"><br>
		<label for="pass">Password</label> <input type="text" name="pass"><br>
		<label for="verifpass">Verif-Password</label> <input type="text" name="verifpass"><br><br>
		<input type="submit" value="Creer Compte">
	</form>
</body>
</html>