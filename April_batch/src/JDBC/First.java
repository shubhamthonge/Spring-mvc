package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class First 
{
	public static void main(String[]args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fusiondb", "root", "shu@#13");
			Statement statement = connection.createStatement();
			int records =statement.executeUpdate("insert into student (id, name, addrl) values(81,'shubham','jaipur')");
			int records1=statement.executeUpdate("insert into student(id,name,addrl) values (63,'karan','pune')");

			System.out.println("records inserted -->"+records);
			System.out.println("records inserted -->"+records1);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
