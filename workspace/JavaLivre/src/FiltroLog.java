import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FiltroLog implements Filter {
	private FilterConfig filterConfig = null;

public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
throws IOException, ServletException {
   ServletContext servletContext = filterConfig.getServletContext();
   servletContext.log("Este o IP =" + req.getRemoteHost() + "Locate=" + req.getLocale()); 
   chain.doFilter(req, res);
   System.out.println("Passei aqui Servlet Filter");
}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
	}

	public void destroy() {
		this.filterConfig = null;
	}
}

