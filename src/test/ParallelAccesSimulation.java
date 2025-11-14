/**
 * 
 */
package test;

import java.util.ArrayList;

import user.UserDao;

/**
 * @author hugog10 oct 2025
 */
public class ParallelAccesSimulation {

	public static void main(String[] args) {
		
		// creamos un objeto que se pueda conectar a la clase UserDao
		UserDao userDao = new UserDao();
		long fromUserId = 14;
		long toUserId = 15;
// creamos una lista con 100 espacios de capacidad
		ArrayList<Thread> threads;
		threads = new ArrayList<Thread>(100);
// bucle que sirve para añadir 100 hilos en la capacidad de la lista a este threads.add(thread);
		// porque el otro solo recorre las 100 posiciones
        System.out.println("number of processor= " +  Runtime.getRuntime().availableProcessors());
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
			// creacion de hilo
			// () -> {} = hace que el codigo sea mas flexible
			Thread thread = new Thread(() -> {
                for (int j = 0;j<5;j++){
				//userDao.transferWithTransactions(fromUserId, toUserId, 1);
                //userDao.transferWithTransactions(toUserId, fromUserId, 1);
                userDao.transferWithTransactionsWithoutDeadlock(fromUserId, toUserId, 1);
                userDao.transferWithTransactionsWithoutDeadlock(toUserId, fromUserId, 1);
                }
			});
			threads.add(thread);

		}
		for (Thread thread : threads) {
			thread.start();
		}
	}
}
