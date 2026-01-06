package com.jdbc;
import java.sql.*;
import java.util.Scanner;
public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Product Id: ");
        int p_id = sc.nextInt();
        String sql = """
                INSERT INTO products (name, prod_id)
                VALUES (?, ?)
            """;
		try (Connection con = DriverManager.getConnection(
				Middleware.CONNECTION_URL); PreparedStatement ps = con.prepareStatement(sql)) {
			 ps.setString(1, name);
	            ps.setDouble(2, p_id);
	            int affectedrows = ps.executeUpdate();
	            if (affectedrows > 0) {
	                System.out.println("✅ Product inserted successfully!");
	            }
		}
		catch(Exception as) {
			System.out.println(as.getMessage());
		}
	}

}
