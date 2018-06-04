import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insert1
 */
@WebServlet("/insert1")
public class insert1 extends HttpServlet {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection conn1 = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        Statement stmt = null;

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/onlinedirectory";
            String username = "root";
            String password = "root";
            Class.forName(driver);
            conn1 = DriverManager.getConnection(url, username , password);
            if (conn1 != null)
                System.out.println("Successful");
            stmt = conn1.createStatement();


            String name = request.getParameter("nam");
            long contact = Long.parseLong(request.getParameter("cnt"));
            String address = request.getParameter("address");
            String company = request.getParameter("company");
            int pin = Integer.parseInt(request.getParameter("pin"));

            stmt.executeUpdate("insert into tele_dir values('" + pin + "','" + name + "','" + contact + "','" + address + "','" + company +"');");
            out.println("updated the records");

        } catch (Exception e) {
            System.out.println("Error: unknown");
            e.printStackTrace();
        } 
        
        finally {
            try {
                stmt.close();
                conn1.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
