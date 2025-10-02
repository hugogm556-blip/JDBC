/**
 * 
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import user.DBHelper;

/**
 * @author hugog17 sept 2025
 */
public class JDBCTest {

	public static void main(String[] args) throws SQLException, InterruptedException {

		// direccion de la base de datos
		// stands for java database connectivity
//		String dbURL = "jdbc:mysql://localhost:3306/bbdd";
//		String username = "root";
//		String password = "admin";
//
//		// clase que administra los drivers de diferentes base de datos
//		DriverManager driverManager;
//		// creamos una conexion con la base de datos mysql
		// creamos un objeto que llame al objeto de conexion de dbhelper
			Connection connection=  DBHelper.getConection();
			try {
//				connection =
//					DriverManager.getConnection(dbURL, username, password);
			String dropSql = " DROP TABLE users";
			
			
			creteUserTable();
			
			String createSQL = "create table if not exists users (" + "id integer not null," + "name VARCHAR(255),"
					+ "pasword VARCHAR(255)," + "vip TINYINT(1)," + "height FLOAT," + "sex VARCHAR(255),"
					+ "PRIMARY KEY (id)" + ")";

			String insertSQL = " INSERT INTO users  values (3, " + " 'Hugo' " + ", " + " '245' " + ", 0, " + "1.8,"
					+ " 'male'  )" + ",(4," + " 'mark'," + " 'lolo'," + " 1," + " 1.8," + "'male')";
			String updateSQL = "UPDATE users SET name ='manu' where id = 1 ";
			

			String deleteSQL = "DELETE From users where id= 3 ";
			
			String selectSQL = " select * from users";
			PreparedStatement ps = connection.prepareStatement(selectSQL);
			// prepareStatment sirve para preparar todo tipo de SQL ETC
			// sacar los datos con el select
			
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Boolean vip = resultSet.getBoolean("vip");
				System.out.println(" record > id = " + id + " name = " + name + " vip = " + vip);
			}
			// ps=connection.prepareStatement(updateSQL);
			// prepareStatment sirve para preparar todo tipo de SQL ETC
			// ps.execute();
			// ps=connection.prepareStatement(updateSQL);
			// prepareStatment sirve para preparar todo tipo de SQL ETC
			// ps.execute();
			// execute sirve para ejecutar todo tipo de SQL ETC
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 
	 */
	private static void creteUserTable() {
		// TODO Auto-generated method stub
		
	}
}
