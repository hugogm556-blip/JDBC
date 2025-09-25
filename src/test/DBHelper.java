/**
 * 
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author hugog24 sept 2025
 */
public class DBHelper {

	String dbURL = "jdbc:mysql://localhost:3306/bbdd";
	String username = "root";
	String password = "admin";

	// clase que administra los drivers de diferentes base de datos
	DriverManager driverManager;
	// creamos una conexion con la base de datos mysql
	Connection connection;
	public Connection getConection() {
		try {
			return DriverManager.getConnection(dbURL, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;
	}
	
}
