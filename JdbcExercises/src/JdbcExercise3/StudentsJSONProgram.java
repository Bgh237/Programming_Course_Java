package JdbcExercise3;

import java.util.Scanner;
import data_access.StudentDAO;


public class StudentsJSONProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Print students (JSON version) ===");
		
		StudentDAO studentDAO = new StudentDAO();

		String studentList = studentDAO.getAllStudentsJSON();

		if (studentList == null) {
			System.out.println("The database is temporarily unavailable. Please try again later.");
		} else {
			System.out.println(studentList);
		}
		input.close();
	}
}
