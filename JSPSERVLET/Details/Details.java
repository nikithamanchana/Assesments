import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Details extends HttpServlet {
	private static final long serialVersionUID = 1L;
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.getWriter().append("Served at: ").append(request.getContextPath());
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  String prid = request.getParameter("pid");
  String name = request.getParameter("name");
  String cost = request.getParameter("price");
  int pid = Integer.parseInt(prid);
  float price = Float.parseFloat(cost);
  try {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first", "root", "Nikki@!04");
    PreparedStatement p = con.prepareStatement("insert into Product values (?,?,?)"); 
    p.setInt(1, pid);
    p.setString(2, name);
    p.setFloat(3, price);
    int i = p.executeUpdate(); 
    pw.println("<h4>" + i + " ROWS INSERTED..."); 
    con.close();
   } catch (Exception e) {
    System.out.println(e);
   }
  }
  public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
   doGet(req, res);
  }
 }