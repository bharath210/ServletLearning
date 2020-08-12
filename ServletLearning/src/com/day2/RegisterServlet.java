package com.day2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet
{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String branch = req.getParameter("branch");
		
		//res.getWriter().println("Mr. "+name+" your ID "+id+" in "+branch+" succesfully registered");
		
//		HttpSession session = req.getSession();
//		session.setAttribute("name", name);
//		session.setAttribute("id", id);
//		session.setAttribute("branch", branch);
		
		Cookie c1 = new Cookie("name", name);
		Cookie c2 = new Cookie("id", id);
		Cookie c3 = new Cookie("branch", branch);
		res.addCookie(c1);
		res.addCookie(c2);
		res.addCookie(c3);

		res.sendRedirect("validate");
	}

}
