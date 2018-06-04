<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.util.*" %>
   <%@page import="java.io.*" %>
   <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		PrintWriter pout = response.getWriter();
		String name = request.getParameter("nam");
		String fno = request.getParameter("fno");
		String date = request.getParameter("dat");
		String phone = request.getParameter("phn");
		int seat = new Random().nextInt(500)+1;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flight_Bookings","root","root");
		Statement stmt = conn.createStatement();
		if(conn!=null)
		{
			try{
			stmt.executeUpdate("insert into SeatReservation values('"+seat+"','"+name+"','"+date+"','"+phone+"','"+fno+"')");
			pout.println("Name: "+name+"Flight-Nuebr: "+fno+"Date:"+date+"Phone-Number"+phone+"Seat-Numebr"+seat+"");
			}
			catch(Exception e)
			{
				pout.println("Couldnot make reservations");
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		


%>
</body>
</html>