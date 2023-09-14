package com.tech;

	import java.io.IOException;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;

import javax.script.ScriptException;
import javax.servlet.http.HttpServlet;


	public class CreateServlet extends HttpServlet {
		public CreateServlet() {
			System.out.println("insid CreateServlet cons");
		}
		protected void servic(HttpServletResponse req,HttpServletRequest res)throws ScriptException,IOException{
			System.out.println("inside servic method");
			String Firstname=req.getParameter("fname");
			String ID=req.getParameter("id");
			String Email=req.getParameter("email");
			System.out.println(Firstname);
			System.out.println(ID);
			System.out.println(Email);

		}

		public static void main(String[] args, String Firstname, String Email, String ID) {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb", "root", "shu@#13");
		        PreparedStatement ps =connection.prepareStatement("insert into employee(Firstname,ID,Email)values(?,?,?,?)");
			    ps.setString(1, Firstname);
			    ps.setString(2, ID);
			    ps.setString(3, Email);

			} catch (Exception e) {
				e.printStackTrace();
			}
			

		}

	}


