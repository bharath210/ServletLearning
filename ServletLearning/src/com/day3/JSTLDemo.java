package com.day3;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLDemo")
public class JSTLDemo extends HttpServlet
{
	public void doGet( HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		String name = "Bharath Kumar";
		Students s1 = new Students(1, "Hannah");
		List<Students> studs = Arrays.asList(new Students(2,"Justin"),new Students(3,"Cley"),new Students(4,"Jessica"));
		
		request.setAttribute("user", name);
		request.setAttribute("student1",s1);
		request.setAttribute("student", studs);
		RequestDispatcher rd = request.getRequestDispatcher("Demo2.jsp");
		rd.forward(request, response);
	}

}