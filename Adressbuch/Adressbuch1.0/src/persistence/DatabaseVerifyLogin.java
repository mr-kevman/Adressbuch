package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseVerifyLogin {
	

	public static boolean verifyLogin(String userNameInput, String userPasswordInput) {
		String url = "jdbc:mysql://localhost:3306/newuserdb";
		String databaseUser = "root";
		String databasePassword = "root";
		String query = "SELECT username FROM newuserdb WHERE username = ? AND password1 = ?";
		boolean allowed = false;

		Connection connection = null;
		PreparedStatement stmt = null;
		try {
			connection = DriverManager.getConnection(url, databaseUser, databasePassword);

			stmt = connection.prepareStatement(query);
			stmt.setString(1, userNameInput);
			stmt.setString(2, userPasswordInput);
			ResultSet result = stmt.executeQuery();

			if (result.next()) {
				allowed = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();

		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}				
		}
		return allowed;
	}
}
	
	
	

