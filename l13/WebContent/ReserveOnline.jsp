<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="ViewDisplay.jsp" method="POST">
	Name : <input type = "text" name="nam">
	Flight_Number : <input type="text" name="fno">
	Date : <input type="text" name="dat">
	Phone : <input type="text" name="phn">
	<input type="submit" name="submit">
	</form>
	
	<h1>Search the flight</h1>
	<form action="ShowFlights.jsp" method="POST">
	WeekDay : <input type="text" name="day">
			<input type="submit" name="submit1">
	</form>

</body>
</html>