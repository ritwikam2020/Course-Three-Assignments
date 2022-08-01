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
 * Servlet implementation class SessionServlet4
 */
@WebServlet("/SessionServlet4")
public class SessionServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	      PrintWriter pwriter = response.getWriter();
	     
	      HttpSession session=request.getSession(false);
	      
	      String myName=(String)session.getAttribute("uname");
	      String myPass=(String)session.getAttribute("upass");
	      String myAge=(String)session.getAttribute("uage");
	      String myEmail=(String)session.getAttribute("uemail");
	      String myCountry=(String)session.getAttribute("ucountry");
	      
	      pwriter.println("session creation time" + session.getCreationTime());
	      pwriter.println("session last accessed time" +session.getLastAccessedTime());
	      pwriter.println("session max interval time" +session.getMaxInactiveInterval());
	      
	      pwriter.print("Name: "+myName+" Pass: "+myPass+"Age: "+myAge+" Email: "+myEmail+"Country: "+myCountry);
	      pwriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
