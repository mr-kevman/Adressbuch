package persistence;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseConnectCreateContact {

	public static Connection databaseLink;

	public static Connection getConnectionContact(String idNumber, String title, String firstName, String secondName, String streetName, String houseNumber,String postCode, String nameOfCity,String country,String phoneNumber, String emailAdress  ) {
		String url = "jdbc:mysql://localhost:3306/newcontactdb";
		String databaseUser = "root";
		String databasePassword = "root";

		try {
			Connection connection = DriverManager.getConnection(url, databaseUser, databasePassword);

			String sql = "INSERT INTO newcontactdb(id, title, firstname, secondname, housenumber, postcode,city , country, phonenumber, emailadress ) VALUES(?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, idNumber);
			statement.setString(2, title);
			statement.setString(3, firstName);

			statement.setString(4, secondName);
			statement.setString(5, houseNumber);
			statement.setString(6, postCode);

			statement.setString(7, nameOfCity);
			statement.setString(8, country);
			statement.setString(9, phoneNumber);
			statement.setString(10, emailAdress);

			
			statement.executeUpdate();
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
			e.getCause();

		}
		return databaseLink;
	}

}
