<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="persistence_boisson">
		<label for="boissonName">Boisson name</label> <input type="text" name="boissonName" required><br>
		<label for="price">Price</label> <input type="number" name="price" step="0.01" required><br>
		<%-- <label for="id">Id : TODO: remove this</label> <input type="number" name="id"  required><br> --%>
		<input type="submit" value="Ajouter Boisson">
	</form>
</body>
</html>