/**
 * 
 */
package db;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author hugog20 oct 2025
 */
/**
 * connection pooling
 */
public class DBUtil {
	
	private static final String dbURL = "jdbc:mysql://localhost:3306/bbdd";
	private static final String username = "root";
	private static final String password = "admin";

	private static HikariDataSource dataSource;
	public static void main(String[] args) {
		// se encarga de meter los datos en una variable y poder usarla en datasource
		HikariConfig config = new HikariConfig();
		config.setUsername(username);
		config.setJdbcUrl(dbURL);
		config.setPassword(password);
		config.setMaximumPoolSize(20);
		// dataSource administra datos ya encapsulados anteriormente 
		dataSource = new HikariDataSource(config);
	}
}
