package classTwo;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class DataCheckFilter implements Filter {
	FilterConfig filterConfig = null;
	public void destroy() {
	}
 
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		String userId = request.getParameter("user");
		String age = request.getParameter("Age");
		System.out.println("From DataCheck filter");
		System.out.println(userId);
		System.out.println(age);
		if( "admin".equals(userId) && "30".equals(age)){
        	response.getWriter().write("passing through DataCheckFilter...............");
            chain.doFilter(request, response);
    }else           
        response.getWriter().write("blocked by DataCheckFilter invalid user or age please check again");
}
 
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}

}
