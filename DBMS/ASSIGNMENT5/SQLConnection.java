import java.sql.*;

/**
 * This is a component class. This class provides connection from the database
 * i.e MySQL.
 * @author Babulal Jangir
 */
public class SQLConnection {

	// Reference variables.
	private static Connection connection;

	/**
	 * This method returns Connection class object.
	 * @return Connection class object
	 */
	public static Connection getConnection(String dbName) {
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, "root", "0000");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
