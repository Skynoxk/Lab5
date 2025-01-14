package task2;

/**
 * This is the main application for Lab5.
 * It create a Session object, set it unique code
 * and the duration of the session, after that it
 * output the information of the session.
 * 
 * Author: Sokha Ordom
 * Date: 01/10/2025
 */

public class Main {
	public static void main(String[] args) {
		Session ai = new Session();
		ai.setSessionName("Introduction to Software Engineering");
		ai.setSessionCode(015);
		try {
			ai.setDuration(1300, 1500);
			System.out.println("Session Name: "+ai.getSessionName());
			System.out.println("Session Code: AIECS "+ai.getSessionCode());
			System.out.println("Session Time: "+ai.getSessionTime());
		} catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
