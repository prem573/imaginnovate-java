package com.jdbc;
import java.sql.*;
public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager.getConnection(
				Middleware.CONNECTION_URL)) {
			PreparedStatement ps = con.prepareStatement("SELECT c.description, AVG(p.price) AS average_price FROM category c JOIN product p ON c.category_id = p.category_id GROUP BY c.description;");
			ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                    rs.getString("description") + " | " +
                    rs.getDouble("average_price")
                );
            }
		}
		catch(Exception as) {
			
		}
	}

}
