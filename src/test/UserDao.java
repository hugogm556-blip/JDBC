/**
 * 
 */
package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author hugog24 sept 2025
 * data access object for table 
 */
public class UserDao {
	
	public void insert(int id, String name, String pasword, boolean vip, int height, String sex) {
	String insertSQL =
			" INSERT INTO users  values (3, " + " 'Hugo' " + ", " + " '245' " + ", 0, " + "1.8,"
			+ " 'male'  )" + ",(4," + " 'mark'," + " 'lolo'," + " 1," + " 1.8," + "'male')";
	Connection connection= DBHelper.getConection();
	 try {
		PreparedStatement ps = connection.prepareStatement(insertSQL);
		 ps.executeUpdate();
		 connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	
	}
}
























