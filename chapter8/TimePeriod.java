package chapter8;

public class TimePeriod {

	private int hours;
	private int minutes;

	public TimePeriod() {
		hours = 0;
		minutes = 0;
	}

	public void addHours(int hoursToAdd) {
		if (hoursToAdd >= 0) {
			this.hours = hours + hoursToAdd;
		}
	}

	public void addMinutes(int minutesToAdd) {
		if (minutesToAdd >= 0) {
			this.minutes = minutes + minutesToAdd;
		}
	}
	
	

	public String toString() {
		return hours + " h " + minutes + " min";
	}
}
