package com.day2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/validate")
public class ValidationServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
//		HttpSession session = req.getSession();
//		String name = (String) session.getAttribute("name");
//		String id=(String) session.getAttribute("id");
//		String branch= (String) session.getAttribute("branch");
		
		Cookie cookie[] = req.getCookies();
		String name= "";
		String id = "";
		String branch = "";
		for(Cookie c: cookie)
		{
			if(c.getName().equals("name"))
				name = c.getValue();
			if(c.getName().equals("id"))
				id = c.getValue();
			if(c.getName().equals("branch"))
				branch = c.getValue();
		}
		
		res.getWriter().println("Mr. "+name+" your ID "+id+" in "+branch+" succesfully Validated");
	}

}
