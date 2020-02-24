package data_access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

import com.google.gson.Gson;

public class StudentDAO {

	public StudentDAO() {
		try {
			Class.forName(ConnectionParameters.jdbcDriver);
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
		}
	}

	private Connection openConnection() throws SQLException {
		return DriverManager.getConnection(ConnectionParameters.connectionString, ConnectionParameters.username,
				ConnectionParameters.password);
	}

	public List<Student> getAllStudents() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Student> studentList = new ArrayList<Student>();

		try {
			connection = openConnection();

			String sqlText = "SELECT id, firstName, lastName, streetAddress, postOffice, postcode FROM Student ORDER BY lastName";

			preparedStatement = connection.prepareStatement(sqlText);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("firstName");
				String lastName = resultSet.getString("lastName");
				String streetAddress = resultSet.getString("streetAddress");
				String postOffice = resultSet.getString("postOffice");
				String postcode = resultSet.getString("postcode");

				studentList.add(new Student(id, firstName, lastName, streetAddress, postOffice, postcode));
			}

		} catch (SQLException sqle) {
			System.out.println("\n[ERROR] MovieDAO: getMovies() failed. " + sqle.getMessage() + "\n");
			studentList = null;

		} finally {
			DbUtils.closeQuietly(resultSet, preparedStatement, connection);
		}

		return studentList;
	}

	public Student getStudentByID(int Id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Student student = null;

		try {
			connection = openConnection();

			String sqlText = "SELECT id, firstName, lastName, streetAddress, postOffice, postcode FROM Student WHERE id = ? ORDER BY lastName";

			preparedStatement = connection.prepareStatement(sqlText);
			preparedStatement.setInt(1, Id);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("firstName");
				String lastName = resultSet.getString("lastName");
				String streetAddress = resultSet.getString("streetAddress");
				String postOffice = resultSet.getString("postOffice");
				String postcode = resultSet.getString("postcode");

				student = new Student(id, firstName, lastName, streetAddress, postOffice, postcode);
			}

		} catch (SQLException sqle) {
			System.out.println("\n[ERROR] Database error. " + sqle.getMessage());
			student = null;

		} finally {
			DbUtils.closeQuietly(resultSet, preparedStatement, connection);
		}

		return student;
	}

	public String getAllStudentsJSON() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Student> studentList = new ArrayList<Student>();

		try {
			connection = openConnection();

			String sqlText = "SELECT id, firstName, lastName, streetAddress, postOffice, postcode FROM Student ORDER BY lastName";

			preparedStatement = connection.prepareStatement(sqlText);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String firstName = resultSet.getString("firstName");
				String lastName = resultSet.getString("lastName");
				String streetAddress = resultSet.getString("streetAddress");
				String postOffice = resultSet.getString("postOffice");
				String postcode = resultSet.getString("postcode");

				studentList.add(new Student(id, firstName, lastName, streetAddress, postOffice, postcode));
			}

		} catch (SQLException sqle) {
			System.out.println("\n[ERROR] MovieDAO: getMovies() failed. " + sqle.getMessage() + "\n");
			studentList = null;

		} finally {
			DbUtils.closeQuietly(resultSet, preparedStatement, connection);
		}
		Gson gson = new Gson();
		String jsonString = gson.toJson(studentList);

		return jsonString;
	}

	public int insertStudent(Student student) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int code = 10;

		int Id = student.getId();
		String firstName = student.getFirstName();
		String lastName = student.getLastName();
		String streetAddress = student.getStreetaddress();
		String postOffice = student.getPostoffice();
		String postcode = student.getPostcode();

		try {

			connection = openConnection();

			String sqlText = "INSERT INTO Student (id, firstname, lastname, streetaddress, postcode, postoffice) VALUES (?, ?, ?, ?, ?, ?)";

			preparedStatement = connection.prepareStatement(sqlText);
			preparedStatement.setInt(1, Id);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, lastName);
			preparedStatement.setString(4, streetAddress);
			preparedStatement.setString(5, postOffice);
			preparedStatement.setString(6, postcode);

			preparedStatement.executeUpdate();
			code = 0;

		} catch (SQLException sqle) {
			
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				code = 1;
			} else {
				System.out.println("\n[ERROR] Database error. " + sqle.getMessage());
				code = -1;
			}

		} finally {
			DbUtils.closeQuietly(preparedStatement, connection);
		}
		return code;
	}

	public int deleteStudent(int studentId) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int code = 10;

		try {
			connection = openConnection();

			String sqlText = "DELETE FROM Student WHERE id=?";

			preparedStatement = connection.prepareStatement(sqlText);
			preparedStatement.setInt(1, studentId);

			//int x = preparedStatement.executeUpdate();
			if (preparedStatement.executeUpdate() != 0) {
				code = 0;
			} else {
				code = 1;
			}
			

			
		} catch (SQLException sqle) {
			
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				code = 1;
				System.out.println("Nothing deleted. Unknown student id (" + studentId + ")");
			} else {
				System.out.println(
						"The database is temporarily unavailable. Please try again later." + sqle.getMessage());
			}

		} finally {
			DbUtils.closeQuietly(preparedStatement, connection);
		}
		return code;
	}

	public int updateStudent(Student student) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int code = 10;

		try {
			connection = openConnection();

			String sqlText = "Update Student SET firstname = ?, lastname = ?, streetaddress = ?, postcode = ?, postoffice = ? WHERE id = "
					+ student.getId();

			preparedStatement = connection.prepareStatement(sqlText);
			preparedStatement.setString(1, student.getFirstName());
			preparedStatement.setString(2, student.getLastName());
			preparedStatement.setString(3, student.getStreetaddress());
			preparedStatement.setString(4, student.getPostcode());
			preparedStatement.setString(5, student.getPostoffice());

			int a = preparedStatement.executeUpdate();
			code = a;

		} catch (SQLException sqle) {
			
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				code = 1;
			} else {
				System.out.println(
						"The database is temporarily unavailable. Please try again later." + sqle.getMessage());
			}

		} finally {
			DbUtils.closeQuietly(preparedStatement, connection);
		}
		
		return code;
	}
}
