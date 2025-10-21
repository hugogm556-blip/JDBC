package test;

import model.User;

public class Test {
	// ctrl + shift +o importar clase

	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("laura");
		User user2 = new User(2, "hugo");
		User user3 = new User(3, "manolo");
		User user4 = new User();
		
		System.out.println(1);
		System.out.println(user1.name);
		System.out.println(user2.name);
		System.out.println(user3.name);
		System.out.println(user4.getPasword());
	}

}
