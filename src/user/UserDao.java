/**
 * 
 */
package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;

/**
 * @author hugog24 sept 2025 data access object for table
 */
public class UserDao {
	int User[];

	public void insert(int id, String name, String pasword, boolean vip, int height, String sex) {
		for (int i = 0; i < User.length; i++) {

		}
		String insertSQL = " INSERT INTO users  values (? , ? ,?,?,?,? )";

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
			ps.setBoolean(4, vip);
			ps.setFloat(5, height);
			ps.setString(6, sex);

			// si nos devuelve 0 significa que no ha cambiado ninguna fila en
			// en la base de datos
			int result = ps.executeUpdate();
			System.out.println(" insert rows " + result);

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// sirve para subir el archivo a git
//	 git add src
//	 git commit -m "git" 
//	 git push -u origin main
		// xxxxxx
	}

	public void delete(int id) {
		String deleteSQL = "DELETE From users where id = ? ";
		Connection connection = DBHelper.getConection();

		try {
			PreparedStatement ps = connection.prepareStatement(deleteSQL);

			ps.setInt(1, id);
			int result = ps.executeUpdate();
			System.out.println("we have delete " + result + " rows. ");
			ps.executeUpdate();

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update(String name, int id) {
		String updateSQL = "UPDATE users SET name = ? where id = ? ";
		Connection connection = DBHelper.getConection();
		try {
			PreparedStatement ps = connection.prepareStatement(updateSQL);
			ps.setString(1, name);
			ps.setInt(2, id);// Sustituir el primer placeholder con el valor de id

			ps.executeUpdate();
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}

	}

	public ArrayList<User> findAll() {
		String selectSQL = "select * from users";
		// este array list sirve para que cuando nos quedamos espacio en la lista
		// este se hace mas grande y hace una copia de los datos originales o anteriores
		// en la
		// nueva lista o array
		User[] users;
		ArrayList<User> userList = new ArrayList<User>();
		Connection connection = DBHelper.getConection();
		try {
			PreparedStatement ps = connection.prepareStatement(selectSQL);
			ResultSet resultSet = ps.executeQuery();
			System.out.println("total rows is " + resultSet.last());
			System.out.println("rows = " + resultSet.getFetchSize());
			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				boolean vip = resultSet.getBoolean("vip");
				String pasword = resultSet.getString("pasword");
				int height = resultSet.getInt("height");
				String sex = resultSet.getString("sex");

				System.out.println(" record > id = " + id + " name = " + name + " vip = " + vip);
				userList.add(new User(id, name, vip, pasword, height, sex, height));
			}
			return userList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	//

	public User[] find(int id) {
		String selectSQL = "select * from users where id = ? ";
		Connection connection = DBHelper.getConection();

		try {
			PreparedStatement ps = connection.prepareStatement(selectSQL);
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();
			System.out.println("rows= " + resultSet.getFetchSize());

			while (resultSet.next()) {

				id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Boolean vip = resultSet.getBoolean("vip");
				System.out.println(" record > id = " + id + " name = " + name + " vip = " + vip);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
