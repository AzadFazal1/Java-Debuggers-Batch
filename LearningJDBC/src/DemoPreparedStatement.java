import java.sql.*;
import java.util.Scanner;
public class DemoPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDebuggers", "root", "qwerty@123");
		
		//Statement statement = connection.createStatement();
		
		int productId;
		String productName;
		String description;
		double price;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product Id");
		productId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product name");
		productName = sc.nextLine();
		System.out.println("Enter product Description");
		description = sc.nextLine();
		System.out.println("Enter product price");
		price = sc.nextDouble();
		
		String query = "insert into Product values(?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1, productId);
		statement.setString(2, productName);
		statement.setString(3, description);
		statement.setDouble(4, price);
		int result = statement.executeUpdate();
		
		System.out.println(result  + "row(s) affected");
		
		statement.close();
		connection.close();
		
		


		

		
	}

}
