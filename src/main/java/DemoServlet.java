import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		
		/*Student s = new Student(1,"bhavin");
		
		req.setAttribute("label", s);
		
		RequestDispatcher rd = req.getRequestDispatcher("Profile.jsp");
		rd.forward(req, res);*/
		
		PrintWriter out = res.getWriter();
		
		String aname = req.getParameter("aname");
		int aid = Integer.parseInt(req.getParameter("aid"));
		
		out.println(aid);
	}

}
