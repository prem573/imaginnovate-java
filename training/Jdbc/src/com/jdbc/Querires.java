package com.jdbc;

import java.sql.*;

public class Querires {

    public static void main(String[] args) {

        String url =
            "jdbc:sqlserver://193.203.160.121:1433;databaseName=master;encrypt=false";
        String user = "sa";
        String pass = "Prempaisa@1";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Connection successful");
            st = con.createStatement();

            String sql = "SELECT name FROM sys.tables";
            rs = st.executeQuery(sql);

            // Read result
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e) {
            System.out.println("❌ Error occurred");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
