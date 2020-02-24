package JdbcExercise4;

import java.util.Scanner;

import data_access.StudentDAO;
import model.Student;

public class StudentUpdateProgram {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Update student (DAO version) ===");

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

		Student x = new Student(a, b, c, d, e, f);
		
		int y = studentDAO.updateStudent(x);

		if (y == 1) {
			System.out.println("Student updated!");
		} else if (y == 0) {
			System.out.println("Nothing updated. " + "Unkown student id (" + a + ")!");
		}
		input.close();
	}
}
