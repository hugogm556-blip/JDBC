/**
 * 
 */
package user;

import model.User;

/**
 * @author hugog16 oct 2025
 */
/*
 * la interface solo sirve para declarar clases
y luego hacerles cuerpo en otras clases llamandolas 
 */
public interface UserDaoInterface {
	/*
	 * insertar un conjunto de usuarios 
	 */
	public int insertAll(User[] users);
/**
 * transferir dinero de un usuario a otro
 * @param fromUserId el enviador 
 * @param toUserId el recipiente 
 * @param amount cantidad dinero enviado 
 * @return
 */
	public boolean transfer(long FromUserId,long toUserId,float amount) ;
	
	/**
	 * transferir dinero de un usuario a otro
	 * @param fromUserId el enviador 
	 * @param toUserId el recipiente 
	 * @param amount cantidad dinero enviado 
	 * @return
	 */
	
	public boolean transferWithBatch(long FromUserId,long toUserId,float amount) ;








}


















