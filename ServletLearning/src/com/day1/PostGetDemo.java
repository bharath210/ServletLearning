package com.day1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostGetDemo extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i  = Integer.parseInt(req.getParameter("num1"));
		int j  = Integer.parseInt(req.getParameter("num2"));
		int  k = i+j;
		
		
//		
//		req.setAttribute("k", k);
//		RequestDispatcher rd = req.getRequestDispatcher("sqr");
//		rd.forward(req, res);
		
		res.sendRedirect("sqr?k="+k);
		
		
	}



}
