/**
 * 
 */
package test;

import user.UserDao;

/**
 * @author hugog29 sept 2025
 */
public class UserDaoTest {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		userDao.insert(0,null,null,false, 0, null);
	}
}
