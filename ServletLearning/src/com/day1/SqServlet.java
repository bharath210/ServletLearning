package com.day1;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//		int k =(int) req.getAttribute("k");
		int k = Integer.parseInt(req.getParameter("k"));
		
		k = k*k;
		
		res.getWriter().println("sq result is "+k);
	}

}
