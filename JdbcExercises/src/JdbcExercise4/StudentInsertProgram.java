package JdbcExercise4;

import java.util.Scanner;

import data_access.StudentDAO;
import model.Student;

public class StudentInsertProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Insert student (DAO version) ===");

		System.out.print("Enter student id: ");
		int a = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter student first name: ");
		String b = input.nextLine();
		
		System.out.print("Enter student last name: ");
		String c = input.nextLine();
		
		System.out.print("Enter student street address: ");
		String d = input.nextLine();
		
		System.out.print("Enter student post office: ");
		String e = input.nextLine();
		
		System.out.print("Enter student postcode: ");
		String f = input.nextLine();

		StudentDAO studentDAO = new StudentDAO();

		//Student student = studentDAO.getStudentByID(a);
		
		Student x = new Student(a, b, c, d, e, f);
		
		int y = studentDAO.insertStudent(x);

		if (y == 0) {
			System.out.println("Student added!");
		} else if (y == 1) {
			System.out.println("Cannot add the student. " + "The student id (" + a + ") is already in use.");
		}/* else {
			System.out.println("\n[ERROR] Database error. " + sqle.getMessage());
		}*/
		input.close();
	}
}
