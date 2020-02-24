package JdbcExercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import data_access.ConnectionParameters;
import data_access.DbUtils;

public class SimpleStudentDeleteProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		System.out.println("=== Delete student ===");

		System.out.print("Enter student id: ");
		int a = Integer.parseInt(input.nextLine());

		try {
			connection = DriverManager.getConnection(ConnectionParameters.connectionString,
					ConnectionParameters.username, ConnectionParameters.password);

			String sqlText = "DELETE FROM Student WHERE id=?";

			preparedStatement = connection.prepareStatement(sqlText);
			preparedStatement.setInt(1, a);

			
			//int b = preparedStatement.executeUpdate();
			
			if (preparedStatement.executeUpdate() != 0) {
				System.out.println("Student deleted!");
			} else {
				System.out.println("Nothing deleted. " + "Unknown student id (" + a + ")");
			}
			
		} catch (SQLException sqle) {
			// First, check if the problem is primary key violation (the error code is
			// vendor-dependent)
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				System.out.println("Nothing deleted. " + "Unknown student id (" + a + ")");
			} else {
				System.out.println(
						"The database is temporarily unavailable. Please try again later." + sqle.getMessage());
			}

		} finally {
			DbUtils.closeQuietly(preparedStatement, connection);
		}

		input.close();
	}

}
