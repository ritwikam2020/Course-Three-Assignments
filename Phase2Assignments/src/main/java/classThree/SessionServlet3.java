package classThree;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet3
 */
@WebServlet("/SessionServlet3")
public class SessionServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();

	      String name = request.getParameter("userName");
	      String password = request.getParameter("userPassword");
	      String age = request.getParameter("Age");
	      String email = request.getParameter("Email");
	      String country = request.getParameter("Country");	      
	      pwriter.print("Hello "+name);	      
	      //creating the HttpSession below
	      HttpSession session=request.getSession(); 
	      
	      session.setAttribute("uname",name);
	      session.setAttribute("upass",password);
	      session.setAttribute("uage",age);
	      session.setAttribute("uemail",email);
	      session.setAttribute("ucountry",country);
	      
	      pwriter.print("<a href='welcome'>view details</a>");
	      pwriter.close();
	}

}
