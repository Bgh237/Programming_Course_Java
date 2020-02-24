package JdbcExercise3;

import java.util.Scanner;

import com.google.gson.Gson;

import data_access.StudentDAO;
import model.Student;

public class StudentSearchProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("=== Find student by id (DAO version) ===");

		System.out.print("Enter student id: ");
		int a = Integer.parseInt(input.nextLine());

		StudentDAO studentDAO = new StudentDAO();

		Student student = studentDAO.getStudentByID(a);

		if (student == null) {
			System.out.println("Unknown student id (" + a + ")");
		} else {

			System.out.println(student.getId() + ": " + student.getFirstName() + " " + student.getLastName() + ", "
					+ student.getStreetaddress() + ", " + student.getPostcode() + " " + student.getPostoffice());
		}
		input.close();
	
	Gson gson = new Gson();
	String studentString = gson.toJson(student);
	}
}
