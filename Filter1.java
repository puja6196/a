package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter1
 */
//@WebFilter("/Filter1")
public class Filter1 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
	/*if(name.isEmpty())
	{
		out.println("Name cannot be empty");
	}
	else
	{
		chain.doFilter(request, response);
	}
	out.println("Filter running...");*/
		if(name.contains("@"))
		{
			name=name.replace("@","????");
			out.println(name);
			out.println("Time----"+System.currentTimeMillis());
		}
		else
			System.out.println("notfound");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
