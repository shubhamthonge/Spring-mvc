package com.tech;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SelectRecords extends HttpServlet {
       
   
    public SelectRecords() {
    	System.out.println("inside constructor");
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    System.out.println("inside do get method");
//    try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//	  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb\", \"root\", \"shu@#13");
//	  String sql="select * form player";
//	  PreparedStatement ps=con.prepareStatement(sql);
//	  ResultSet rs=ps.executeQuery();
//	  ArrayList<Player> al=new ArrayList();
//	  while(rs.next()){
//		  System.out.println("*******************");
//		  String fname=rs.getString("fname");
//		  System.out.println(fname);
//		  String lname=rs.getString("lname");
//		  System.out.println(lname);
//		  String email=rs.getString("email");
//		  System.out.println(email);
//		  Player p=new Player(fname,lname,email);
//		  al.add(p);
//		  req.setAttribute("Fname", al);
//		  System.out.println("*********************");
//	  }
//	  
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//    RequestDispatcher rd=req.getRequestDispatcher("success.jsp");
//		rd.forward(req, res);
//	}
//
}
}
