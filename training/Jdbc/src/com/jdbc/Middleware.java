package com.jdbc;

public class Middleware {
	public static final String CONNECTION_URL = 
			"jdbc:sqlserver://193.203.160.121:1433;databaseName=prem;encrypt=false;user=sa;password=Prempaisa@1";

	public static String getConnectionUrl() {
		return CONNECTION_URL;
	}
}
