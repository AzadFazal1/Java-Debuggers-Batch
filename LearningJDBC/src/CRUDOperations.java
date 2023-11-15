import java.sql.*;

public class CRUDOperations {
	
	public static String createTable() {
		return "create table Books (bookId int, title varchar(100), noOfPages int)";
	}
	
	public static String insertIntoTable() {
		return "insert into Books values (1, 'The Great Gatsby', 500),(2, 'Harry Potter', 234),(3, 'Star Wars', 445),(4, 'Cracking the coding interview', 444)";
	}
	
	public static String getAllRecords() {
		return " select * from Books";
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		// 2- Load and Register the driver
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// 3- Establish the connection
				
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDebuggers", "root", "qwerty@123");

				// 4- Create the statement
				
				Statement statement = connection.createStatement();
				
				// 5- Create the result set
				
				String query ="";
				//query = createTable();
				//query = insertIntoTable();
				query = getAllRecords();
				//int resultSet = statement.executeUpdate(query);
				ResultSet resultSet = statement.executeQuery(query);
				
				// 6- Process the result set
				
				while(resultSet.next()) {
					int id = resultSet.getInt(1);
					String title = resultSet.getString(2);
					int noOfPages = resultSet.getInt(3);

					System.out.println("id : " + id + " title : " + title 
							+ " noOfPages : " + noOfPages);
					
				}
				
				// 7- Close the statement and connection
				
				statement.close();
				connection.close();
			
	}
}
