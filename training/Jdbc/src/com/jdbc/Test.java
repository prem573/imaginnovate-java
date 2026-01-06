package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

    public static void main(String[] args) {

        String url =
          "jdbc:sqlserver://193.203.160.121:1433;databaseName=master;encrypt=false";
        String user = "sa";
        String pass = "Prempaisa@1";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Driver loaded & connection successful");
            con.close();
        } catch (Exception e) {
            System.out.println("❌ Connection failed");
            e.printStackTrace();
        }
    }
}
