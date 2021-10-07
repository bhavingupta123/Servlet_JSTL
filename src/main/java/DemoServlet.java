import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServelet")
public class DemoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		
		Student s = new Student(1,"bhavin");
		
		req.setAttribute("label", s);
		
		RequestDispatcher rd = req.getRequestDispatcher("Profile.jsp");
		rd.forward(req, res);
	}

}
