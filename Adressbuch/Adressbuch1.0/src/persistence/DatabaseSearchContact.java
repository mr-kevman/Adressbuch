package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import application.Contact;

public class DatabaseSearchContact {

	public static List<Contact> searchContactInDb(String searchInput, String userNameInput) {

		String url = "jdbc:mysql://localhost:3306/newcontactdb";
		String databaseUser = "root";
		String databasePassword = "root";
		String query = "SELECT firstname, secondname, housenumber, postcode, city, country, phonenumber, emailadress, username FROM newcontactdb WHERE (firstname LIKE ? OR secondname LIKE ? OR housenumber LIKE ? OR postcode LIKE ? OR city LIKE ? OR country LIKE ? or phonenumber LIKE ? OR emailadress LIKE ? AND username = ? )FROM newcontactdb  VALUES(?,?,?,?,?,?,?,?,?)";

		Connection connection = null;
		PreparedStatement stmt = null;

		List<Contact> resultList = new ArrayList<Contact>();

		try {
			connection = DriverManager.getConnection(url, databaseUser, databasePassword);

			stmt = connection.prepareStatement(query);
			stmt.setString(1, "%" + searchInput + "%"); // 1.suche nach firstname
			stmt.setString(2, "%" + searchInput + "%"); // 2.suche nach secondname
			stmt.setString(3, "%" + searchInput + "%"); // 3.suche nach housenumber
			stmt.setString(4, "%" + searchInput + "%"); // 4.suche nach postcode
			stmt.setString(5, "%" + searchInput + "%"); // 5.suche nach city
			stmt.setString(6, "%" + searchInput + "%"); // 6.suche nach country
			stmt.setString(7, "%" + searchInput + "%"); // 7.suche nach phonenumber
			stmt.setString(8, "%" + searchInput + "%"); // 8.suche nach emailadress
			stmt.setString(9, userNameInput); 			// 9. abgleich mit userName 

			ResultSet result = stmt.executeQuery();

			while (result.next()) {
				resultList.add(new Contact(result.getString(1), result.getString(2), result.getString(3),
						result.getString(4), result.getString(5), result.getString(6), result.getString(7),
						result.getString(8), result.getString(9)));

				System.out.println(resultList.toString());
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
		return resultList;

	}

}



		
	


