package Week1;

public class Student extends Person {
	private int credits;

	public Student(String name) {
		super(name);
		
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Student: " + getName() + ", " + credits + " credits";
	}
	
	public void completeCourse() {
		credits = credits + 5;
		
	}
	
	
}
