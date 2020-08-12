package com.day2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// ServleContext parameters can access by all servlet
// ServletParameters can only be accessed by that particular servlet
public class ServletContextDemo extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.getWriter().println("Hi</br> ");
		ServletContext ctx = getServletContext();
		String user = ctx.getInitParameter("user");
		String os = ctx.getInitParameter("os");
		res.getWriter().println(user+" "+os);
		PrintWriter out = res.getWriter();
		out.println("</br>");
		
		ServletConfig sg = getServletConfig();
		String sUser = sg.getInitParameter("user");
		out.println(sUser);
		
	}

}
