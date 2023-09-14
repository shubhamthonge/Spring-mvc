package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Example {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb", "root", "root");
			PreparedStatement ps1=connection.prepareStatement("insert into student1(no,name,marks) values (?,?,?)");
			ps1.setInt(1,8);
			ps1.setString(2,"shubh");
			ps1.setInt(3,89);
			
			int output=ps1.executeUpdate();
			System.out.println(ps1);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
