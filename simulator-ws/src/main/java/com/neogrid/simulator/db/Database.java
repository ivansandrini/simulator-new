package com.neogrid.simulator.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
	
	private String userName;
	private String password;
	private String dbms;
	private String serverName;
	private String portNumber;
	private String dbName;

	public Connection getConnection() throws SQLException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", this.userName);
	    connectionProps.put("password", this.password);

	    if (this.dbms.equals("mysql")) {
	        conn = DriverManager.getConnection("jdbc:" + this.dbms + "://" +
	                   this.serverName + ":" + this.portNumber + "/", connectionProps);
	    } else if (this.dbms.equals("derby")) {
	        conn = DriverManager.getConnection("jdbc:" + this.dbms + ":" + this.dbName +
	                   ";create=true", connectionProps);
	    }
	    System.out.println("Connected to database");
	    return conn;
	}

}
