package classTwo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
//@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }
    	protected void service(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		doGet(request, response);
    	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");

		ServletConfig conf = getServletConfig();
		ServletContext cxt = getServletContext();
		//int d = Integer.parseInt(conf.getInitParameter("d")); // Step 2: fetching the parameters from the web.xml
		//int a = Integer.parseInt(cxt.getInitParameter("a"));
		//int b = Integer.parseInt(cxt.getInitParameter("b"));
		//int c = Integer.parseInt(cxt.getInitParameter("c"));
		//pw.println("a+b+c+d " + (a + b + c + d));
		String d=conf.getInitParameter("d");
		String a = cxt.getInitParameter("a");
		String b = cxt.getInitParameter("b");
		String c = cxt.getInitParameter("c");
		pw.println("a+b+c+d " +a+b+c+d);
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
