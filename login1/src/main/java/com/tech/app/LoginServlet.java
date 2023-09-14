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
	private static final long serialVersionUID = 1L;
	private DriverManager out;
       
       public LoginServlet() {
    	   
       }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb", "root","shu@#13");
			String f=request.getParameter("fname");
			String l=request.getParameter("lname");
			String e=request.getParameter("email");
			PreparedStatement ps=con.prepareStatement("insert into  student3 where (firstname, lastname, email)values(?,?,?)");
			ps.setString(1, f);
			ps.setString(2, l);
			ps.setString(3, e);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) 
			{
				RequestDispatcher rd=request.getRequestDispatcher("welcome.jap");
				rd.forward(request,response);
			}
			else
	
			out.println("<font color=red >login Faild!!<br>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
