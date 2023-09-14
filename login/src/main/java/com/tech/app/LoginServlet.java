package com.tech.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
       
    	public LoginServlet() {
		System.out.println("inside constructor");
	}

		protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    	    	System.out.println("inside srevice method");
    	    	String Entername=req.getParameter("fname");
    	    	String Enterpassword=req.getParameter("lname");
    	    	System.out.println(Entername);
    	    	System.out.println(Enterpassword);

    		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb", "root", "shu@#13");
				PreparedStatement ps=cn.prepareStatement("select Entername form login where Entername=? and Enterpassword=?" );
				ps.setString(1, Entername);
				ps.setString(2, Enterpassword);
				ResultSet rs=ps.executeQuery();
				int record=ps.executeUpdate();
				System.out.println("record insert"+1);
				RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
				rd.forward(req,res);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}

}
