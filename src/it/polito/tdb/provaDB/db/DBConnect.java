package it.polito.tdb.provaDB.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	
	//ha solo un metodo per permettere la connessione
	
	public static Connection getConnection() {
		
		String jdbcURL="jdbc:mysql://localhost/dizionario?user=root&password=ulla97";
		
		try {
			Connection conn=DriverManager.getConnection(jdbcURL);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	

}
