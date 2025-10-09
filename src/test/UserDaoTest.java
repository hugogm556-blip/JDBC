/**
 * 
 */
package test;

import java.util.ArrayList;

import model.User;
import user.UserDao;

/**
 * @author hugog29 sept 2025
 */
public class UserDaoTest {
	public static void main(String[] args) {
//		UserDao userDao = new UserDao();
//		userDao.insert(6,"hugo","lol", false, 0, null);
		//UserDao userDeleteDao= new UserDao();
		//userDeleteDao.delete(9);
		//UserDao updateUserDao = new UserDao();
		//updateUserDao.update("hugo", 1);
		UserDao selectUserDao= new UserDao();
		selectUserDao.findAll();
//		UserDao findUserDao = new UserDao();
//		findUserDao.find(1);
		ArrayList<User> users  = selectUserDao.findAll();
		System.out.println(users.size());
	
	}
	
}
