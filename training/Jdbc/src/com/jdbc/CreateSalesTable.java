package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateSalesTable {

    public static void main(String[] args) {

        String sql = """
            CREATE TABLE sales (
                sale_id INT IDENTITY(1,1) PRIMARY KEY,
                product_id INT,
                quantity INT,
                total_amount FLOAT,
                sale_date DATE
            )
        """;

        try (Connection con = DriverManager.getConnection(Middleware.CONNECTION_URL);
             Statement st = con.createStatement()) {

            st.execute(sql);
            System.out.println("✅ sales table created successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
