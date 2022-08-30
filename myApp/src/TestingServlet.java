import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class TestingServlet extends HttpServlet {

	public void doGet (HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
        res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	String name = req.getParameter("nm"); //nm in the parameter is textbox name of the form of the html file from where it is called
	pw.println("<html>");
	pw.println("<head><title>Hello World</title></head>");
	pw.println("<body>");
	pw.println("Hello " + name);
	pw.println("</body></html>");
              
	}
        }

