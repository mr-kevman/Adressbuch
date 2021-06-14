package persistence;


import java.sql.*;



public class DatabaseConnectCreateUser  {

	public static Connection databaseLink;

	public static Connection getConnection(String userName, String password1, String password2) {
		String url = "jdbc:mysql://localhost:3306/newuserdb";
		String databaseUser = "root";
		String databasePassword = "root";

		try {
			Connection connection = DriverManager.getConnection(url, databaseUser, databasePassword);

			String sql = "INSERT INTO newuserdb(username,password1,password2) VALUES(?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, userName);
			statement.setString(2, password1);
			statement.setString(3, password2);

			statement.executeUpdate();
			statement.close();
			
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();

		}
		return databaseLink;
	}

	
	
	
	public static  void closeConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/newuserdb";
		String databaseUser = "root";
		String databasePassword = "root";
		

			
			Connection	connection = DriverManager.getConnection(url,databaseUser,databasePassword);
		
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
		
		
	}
	
}
