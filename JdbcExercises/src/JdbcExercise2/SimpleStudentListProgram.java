package JdbcExercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import data_access.ConnectionParameters;
import data_access.DbUtils;

public class SimpleStudentListProgram {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		System.out.println("=== Print students ===");

		try {
			// 1. Open a database connection
			connection = DriverManager.getConnection(ConnectionParameters.connectionString,
					ConnectionParameters.username, ConnectionParameters.password);

			// 2. Define the SQL query text
			String sqlText = "SELECT * FROM Student ORDER BY lastname";

			// 3. Create a prepared statement based on the SQL query text
			preparedStatement = connection.prepareStatement(sqlText);

			// 4. Execute the SQL query with the PreparedStatement object
			resultSet = preparedStatement.executeQuery();

			// 5. Iterate the results.
			// NB! The next() method moves the cursor to the next available row in the
			// results. Initially, the cursor is 'before the first row'.
			// The next() method returns false if there are no more rows.
			while (resultSet.next()) {

				// 6. Each column value has to be retrieved separately as below
				String firstname = resultSet.getString("firstname");
				String lastname = resultSet.getString("lastname");
				String streetaddress = resultSet.getString("streetaddress");
				String postoffice = resultSet.getString("postoffice");
				int id = resultSet.getInt("id");
				String postcode = resultSet.getString("postcode");

				System.out.println(id + ": " + firstname + " " + lastname + ", " + streetaddress + ", " + postcode + " " + postoffice);
			}

		} catch (SQLException sqle) {
			// 7. If any JDBC operation fails, we display an error message here
			System.out.println("\n[ERROR] Database error. " + sqle.getMessage());

		} finally {
			// 8. The resources should be closed as soon as we don't need them anymore
			DbUtils.closeQuietly(resultSet, preparedStatement, connection);
		}
	}
}