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
//@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		ServletConfig conf = getServletConfig();
		ServletContext cxt = getServletContext();
		int d = Integer.parseInt(conf.getInitParameter("d")); // Step 2: fetching the parameters from the web.xml
		int a = Integer.parseInt(cxt.getInitParameter("a"));
		int b = Integer.parseInt(cxt.getInitParameter("b"));
		int c = Integer.parseInt(cxt.getInitParameter("c"));
		pw.println("a*d " + (a * d));
		pw.println("b-c " + (b - c));
		pw.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
