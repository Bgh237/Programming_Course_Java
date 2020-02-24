package JdbcExercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import data_access.ConnectionParameters;
import data_access.DbUtils;

public class SimpleStudentInsertProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
		System.out.println("=== Add student ===");
		
		System.out.print("Id: ");
		int a = Integer.parseInt(input.nextLine());
		
		System.out.print("First name: ");
		String b = input.nextLine();
		
		System.out.print("Last name: ");
		String c = input.nextLine();
		
		System.out.print("Street: ");
		String d = input.nextLine();
		
		System.out.print("Postcode: ");
		String e = input.nextLine();
		
		System.out.print("Post office: ");
		String f = input.nextLine();
		
 		try {
			connection = DriverManager.getConnection(ConnectionParameters.connectionString,
					ConnectionParameters.username, ConnectionParameters.password);
							
			String sqlText = "INSERT INTO Student (id, firstname, lastname, streetaddress, postcode, postoffice) VALUES (?, ?, ?, ?, ?, ?)";
			
			preparedStatement = connection.prepareStatement(sqlText);
			preparedStatement.setInt(1, a);
			preparedStatement.setString(2, b);
			preparedStatement.setString(3, c);
			preparedStatement.setString(4, d);
			preparedStatement.setString(5, e);
			preparedStatement.setString(6, f);
			
			preparedStatement.executeUpdate();
			System.out.println();
			System.out.println("Student data added!");
			
		} catch (SQLException sqle) {
			// First, check if the problem is primary key violation (the error code is vendor-dependent)
			if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
				System.out.println("Cannot add the student. " + "The student id (" + a + ") is already in use.");
			} else {
				System.out.println("The database is temporarily unavailable. Please try again later." + sqle.getMessage());
			}
			
		} finally {
			DbUtils.closeQuietly(preparedStatement, connection);
		}
 		input.close();
	}

}
