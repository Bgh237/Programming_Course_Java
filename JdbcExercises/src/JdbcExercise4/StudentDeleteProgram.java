package JdbcExercise4;

import java.util.Scanner;

import data_access.StudentDAO;


public class StudentDeleteProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Delete student (DAO version) ===");

		System.out.print("Enter student id: ");
		int a = Integer.parseInt(input.nextLine());
		
		StudentDAO studentDAO = new StudentDAO();

		int y = studentDAO.deleteStudent(a);

		if (y == 0) {
			System.out.println("Student deleted!");
		} else if (y == 1) {
			System.out.println("Cannot delete the student. " + "The student id (" + a + ") is unknown.");
		}
		
		input.close();
	}
}
