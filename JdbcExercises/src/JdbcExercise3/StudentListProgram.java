package JdbcExercise3;

import java.util.List;

import data_access.StudentDAO;
import model.Student;

public class StudentListProgram {

	public static void main(String[] args) {
		System.out.println("=== Print students (DAO version) ===");

		StudentDAO studentDAO = new StudentDAO();

		List<Student> studentList = studentDAO.getAllStudents();

		if (studentList == null) {
			System.out.println("The database is temporarily unavailable. Please try again later.");
		} else {
			for (Student student : studentList) {
				System.out.println(student.getId() + ": " + student.getFirstName() + " " + student.getLastName() + ", "
						+ student.getStreetaddress() + ", " + student.getPostcode() + " " + student.getPostoffice());
			}
		}
	}
}
