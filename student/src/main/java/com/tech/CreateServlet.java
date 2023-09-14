package com.tech;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.rmi.AccessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.AsyncDispatcher;
import org.apache.tomcat.util.bcel.classfile.ClassFormatException;

public class CreateServlet extends HttpServlet{

	public CreateServlet() {
		System.out.println("inside CreateServlet constructor");
		
	}
	
    public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
	System.out.println("inside srevice method");
	String firstname=req.getParameter("fname");
	String lastname=req.getParameter("lname");
	String email=req.getParameter("email");
	System.out.println(firstname);
	System.out.println(lastname);
	System.out.println(email);

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb", "root", "shu@#13");
		PreparedStatement ps=cn.prepareStatement("insert into student3 (firstname, lastname, email)values(?,?,?,?)");
		ps.setString(1, firstname);
		ps.setString(2, lastname);
		ps.setString(3, email);
		int record=ps.executeUpdate();
		System.out.println("record insert"+1);
		RequestDispatcher rd=req.getRequestDispatcher("Create.jsp");
		rd.forward(req,res);
	} catch (Exception e) {
		e.printStackTrace();
	
		
	}
	
	}
	}

