/**
 * 
 */
package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author hugog24 sept 2025 data access object for table
 */
public class UserDao {

	public void insert(int id, String name, String pasword, boolean vip, int height, String sex) {
		String insertSQL = " INSERT INTO users  values (? , ? ,? , ? ,? ,?,?  )";

		Connection connection = DBHelper.getConection();
		try {
			PreparedStatement ps = connection.prepareStatement(insertSQL);
			/*
			 * la instancia/objeto de la clase PrepareStatement se encarga de sustituir los
			 * placeholders ? con los valores pasados a traves de los parametros de manera
			 * que nos permite reutilizar el codigo mas
			 */
			ps.setInt(1, id);// Sustituir el primer placeholder con el valor de id
			ps.setString(2, name);
			ps.setString(3, pasword);

			ps.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// sirve para subir el archivo a git
//	 git add src
//	 git commit -m "gitano" 
//	 git push -u origin master
		// xxxxxx
	}
}
