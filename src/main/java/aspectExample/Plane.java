package aspectExample;

import org.springframework.stereotype.Component;

@Component
public class Plane {

	public void reserveSeat(User user, int row, int number) {
		System.out.println("Seat reservation:" + row + ", " + number);
	}
	
	public void reserveRow(User usuario, int row) {
		System.out.println("Row reservation: " + row);
	}
	
}
