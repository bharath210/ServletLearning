package com.day4;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SignInFilter1
 */
@WebFilter("/SignIn")
public class SignInFilter1 implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		int id = Integer.parseInt(req.getParameter("id"));
		if(id>0)
		{
			chain.doFilter(request, response);
		}
		else
		{
			res.getWriter().println("Enter valid id");
		}
	}



}
