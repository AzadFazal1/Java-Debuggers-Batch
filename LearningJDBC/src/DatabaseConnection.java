// 1- Import the package
import java.sql.*;

public class DatabaseConnection {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 2- Load and Register the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 3- Establish the connection
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDebuggers", "root", "qwerty@123");

		// 4- Create the statement
		
		Statement statement = connection.createStatement();
		
		// 5- Create the result set
		
		ResultSet resultSet = statement.executeQuery("select * from Product");
		
		// 6- Process the result set
		
		while(resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String description = resultSet.getString(3);
			double price = resultSet.getDouble(4);
			System.out.println("id : " + id + " name : " + name 
					+ " Description : " + description + " Price : " + price);
			
		}
		
		// 7- Close the statement and connection
		
		statement.close();
		connection.close();
	}

}
