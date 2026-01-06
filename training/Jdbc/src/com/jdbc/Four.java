package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Four {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int productId = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Total Amount: ");
        double totalAmount = sc.nextDouble();

        String sql = """
            INSERT INTO sales (product_id, quantity, total_amount, sale_date)
            VALUES (?, ?, ?, CAST(GETDATE() AS DATE)
)
        """;

        try (Connection con = DriverManager.getConnection(Middleware.CONNECTION_URL);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, productId);
            ps.setInt(2, quantity);
            ps.setDouble(3, totalAmount);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ Sales transaction inserted successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
