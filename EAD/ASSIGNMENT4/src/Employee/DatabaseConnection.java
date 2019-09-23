package Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Define the data base connection and connect with database
 * 
 * @author Babulal Jangir
 *
 */
public class DatabaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/EmployeeDetails";			
			connection = DriverManager.getConnection(url, "root", "0000");
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return connection;
	}

}

