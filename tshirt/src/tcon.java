
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import java.sql.*;

/**
 * Servlet implementation class tcon
 */
@WebServlet("/tcon")
public class tcon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
			
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		if(con!=null)
		{
		String tag = request.getParameter("tag");
		String accessories = request.getParameter("accessories");
		String color = request.getParameter("color");
		int pocket = Integer.parseInt(request.getParameter("pocket"));

		String sql = "INSERT INTO tshirt(color, chest_pocket, tag, accessories) VALUES (?,?,?,?)";

		try {
			PreparedStatement stmt1 = con.prepareStatement(sql);
			stmt1.setString(1, color);
			stmt1.setInt(2, pocket);
			stmt1.setString(3, tag);
			stmt1.setString(4, accessories);
			stmt1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("show.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
