package com.jdbc;

import java.sql.*;

public class Five {

    public static void main(String[] args) {

        String sql = """
            INSERT INTO sales (product_id, quantity, total_amount, sale_date)
            VALUES (?, ?, ?, ?)
        """;

        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DriverManager.getConnection(Middleware.CONNECTION_URL);

    
            con.setAutoCommit(false);

            ps = con.prepareStatement(sql);

            // -------- Product 1 --------
            ps.setInt(1, 101);
            ps.setInt(2, 2);
            ps.setDouble(3, 2000);
            ps.setDate(4, new java.sql.Date(System.currentTimeMillis()));
            ps.executeUpdate();

            // -------- Product 2 --------
            ps.setInt(1, 102);
            ps.setInt(2, 1);
            ps.setDouble(3, 1500);
            ps.setDate(4, new java.sql.Date(System.currentTimeMillis()));
            ps.executeUpdate();

            // ✅ If both succeed
            con.commit();
            System.out.println("✅ Transaction committed successfully");

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();
                    System.out.println("❌ Transaction rolled back due to error");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();

        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
