package com.tech;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	
	public LoginServlet() {
System.out.println("inside login servelt cons");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	System.out.println("--inside service method---");
	String name = req.getParameter("uname");
	System.out.println(name);
	
	req.setAttribute("Name", name);
	req.setAttribute("code", "200");

	//success.jsp  -> 200
	//failure.jsp --> 404
	res.setStatus(200);
	
	
   	
	RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
	rd.forward(req, res);
	
	}
	}

