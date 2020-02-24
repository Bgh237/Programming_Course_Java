package Week2;

import java.util.HashMap;
import java.util.Map;

public class ObjectsCourseMapProgram {

	public static void main(String[] args) {
		Map<String, Course> courseMap = new HashMap<String, Course>();
		Course one = new Course("swd1tf001", "Orientation to Software Engineering", "5cr");
		Course two = new Course("swd4tf033", "Programming 2", "5cr");
		Course three = new Course("swd4tf032", "Programming 1", "5cr");

		courseMap.put("swd1tf001", one);
		courseMap.put("swd4tf033", two);
		courseMap.put("swd4tf032", three);
		
		for (Course course : courseMap.values()) {
			System.out.println(course);
			}
		
		System.out.println("---");
		
		System.out.println(courseMap.get("swd4tf033"));
		
	}

}
