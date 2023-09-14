package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class Result {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb", "root", "shu@#13");
			PreparedStatement ps=connection.prepareStatement("insert into employee1(id,name,age) values (?,?,?)");

			ps.setInt(1,62);
			ps.setString(2,"kumar");
			ps.setInt(3,26);

			int result=ps.executeUpdate();
			System.out.println(result);
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


}


