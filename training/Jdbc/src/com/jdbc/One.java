package com.jdbc;

import java.sql.*;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=1;
		try (Connection con = DriverManager.getConnection(
				Middleware.CONNECTION_URL)) {
//			PreparedStatement ps = con.prepareStatement("insert into Products (name,prod_id)values(?,?)");
//			ps.setString(1, "Product 1");  
//			ps.setInt(2, 2);   
//			ps.setString(1, "Product 2"); 
			
//			ps.setInt(2, 24);   
//			ps.executeUpdate();
			PreparedStatement ps = con.prepareStatement("UPDATE Products SET name = ?, prod_id = ? WHERE id = ? ");
			ps.setString(1, "Product 2ddd"); 
			ps.setInt(2, 24); 
			ps.setInt(3, id);
			int rows = ps.executeUpdate();
			if (rows > 0) {
			    System.out.println("✅ Category updated successfully!");
			} else {
			    System.out.println("⚠ No record found with given id");
			}
			ps.close();
		}
		catch(Exception af) {
			System.out.println("Error : " + af.getMessage());
		}
		
	}

}
