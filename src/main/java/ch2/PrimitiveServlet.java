package ch2;

import javax.servlet.*;
import java.io.IOException;

public class PrimitiveServlet implements Servlet {
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init");
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		System.out.println("service");
	}

	public String getServletInfo() {
		return null;
	}

	public void destroy() {
		System.out.println("destroy");
	}
}
