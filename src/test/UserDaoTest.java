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
////		userDao.insert(6,"hugo","lol", false, 0, null);
//		//UserDao userDeleteDao= new UserDao();
//		//userDeleteDao.delete(9);
//		UserDao updateUserDao = new UserDao();
//		updateUserDao.update("aday", 1);
//		UserDao selectUserDao= new UserDao();
//		//selectUserDao.findAll();
//	UserDao findUserDao = new UserDao();
//		findUserDao.find(1);
//		ArrayList<User> users  = selectUserDao.findAll();
//		System.out.println(users.size());
//	
//		User users1  = findUserDao.find(3);
//		System.out.println(users1.getName());
//	userDao.insertAll(null);
//	
//	User[] us= {
//			new User(16, "hugo", false, "assa", 3, "tres", 2, 2.4f),
//			new User(17, "Cata", true, "asta", 5, "treshh", 34, 2.7f)	};
//	userDao.insertAll(us);
	userDao.transferWithQueryAndUpdate(14, 15, 10);
	}
	
}
