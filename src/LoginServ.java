

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		out.print("<b> Welcome To Registration Page <b/><br/>");
		String name =  request.getParameter("uname");
		String pass =  request.getParameter("upass");
		
		if(pass.equals("123"))
		{
			RequestDispatcher d=request.getRequestDispatcher("profileserv");
			d.forward(request, response);
			
			//response.sendRedirect("profile.html");
			out.print("Welcome : "+name);
		}
		else
		{
			RequestDispatcher d=request.getRequestDispatcher("index.html");
			d.include(request, response);
			out.print("SORRY,Username and Password Wrong");
		}
	}

}
