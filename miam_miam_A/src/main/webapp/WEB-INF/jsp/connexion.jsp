<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connexion</title>
</head>
<body>
	<form action="connexion_client">
	<label for="login">Login</label>
	<input type="text" name="login">
	<label for="pass">Password</label>
	<input type="text" name="pass">
		<input type="submit" value="Connexion client">
	</form><br>
	
	<form action="gerant">
	<label for="login">Login</label>
	<input type="text" name="login">
	<label for="pass">Password</label>
	<input type="text" name="pass">
		<input type="submit" value="Connexion gerant">
	</form><br>
	
	<form action="creer_un_compte">
		<input type="submit" value="Creer un Compte">
	</form>
</body>
</html>