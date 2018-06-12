<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Car Dealership</title>
</head>
<body>
<h2>Search for a Car: </h2>

<form action="carmake">
	Make: <input type="text" name="make"><br>
	<input type="submit" value="Submit">
</form><br>

<form action="carmodel">
	Model: <input type="text" name="model"><br>
	<input type="submit" value="Submit">
</form><br>

<form action="caryear">
	Year: <input type="text" name="year"><br>
	<input type="submit" value="Submit">
</form><br>

<form action="carcolor">
	Color: <input type="text" name="color"><br>
	<input type="submit" value="Submit">
</form><br>





</body>
</html>