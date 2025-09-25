package connectiontest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionTest {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// direccion de la base de datos
		// stands for java database connectivity
		String dbURL = "jdbc:mysql://localhost:3306/bbdd";
		String username = "root";
		String password = "admin";

		// clase que administra los drivers de diferentes base de datos
		DriverManager driverManager;
		// creamos una conexion con la base de datos mysql
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		System.out.println(connection);

		/**
		 * las conexiones con las bases de datos son objetos pesados, el proceso de
		 * establecimiento de la conexion consume mucho recursos del ordenador Una
		 * prueba de cuantas conexiones se pueden establecer con una base de datos
		 */

		Connection[] connections = new Connection[100];
		// conection le he puesto corchetes para poder guardar cosas luego he creado
		// connections que es una variable que me guarde las
		// conexiones de Conection que 10000
		for (int i = 0; i < connections.length; i++) {
			connections[i] = DriverManager.getConnection(dbURL, username, password);
			// luego he hecho un bucle que me lea la longitud de mi variable connections que
			// son 10000
			// y vaya haciendo conexiones hasta los 10000 pero me da error porque no se
			// pueden hacer tantas conexiones
			System.out.println(connections);
			
		}
		
	}

}
