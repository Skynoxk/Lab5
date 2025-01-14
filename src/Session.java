package task2;

/**
 * Session Class is a class that contain the information
 * of a session as well as the method to set Duration.
 * @author Sokha Ordom
 * @version 2.0
 * @modify 2025/01/10
 * Review by Viphou
 */

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Session {
	private String sessionName;
	private int sessionTime;
	private int sessionCode;
	
	void setDuration(int startTime, int endTime) {
		
		// Measure in Minutes (Ex: 1300 = 13:00pm)
		int startMinutes = (startTime / 100) * 60 + (startTime % 100);
        int endMinutes = (endTime / 100) * 60 + (endTime % 100);

        if (startMinutes > endMinutes) {
            throw new IllegalArgumentException("Start time cannot be later than end time.");
        }

        sessionTime = endMinutes - startMinutes;
	}
	
}


