package Week2;

public class Course {
	private String courseCode;
	private String name;
	private String credits;

	public Course(String courseCode, String name, String credits) {
		super();
		this.courseCode = courseCode;
		this.name = name;
		this.credits = credits;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return courseCode + ": " + name + ", " + credits;
	}

}
