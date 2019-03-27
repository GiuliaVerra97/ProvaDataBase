package it.polito.tdp.provaDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.polito.tdb.provaDB.db.DizionarioDAO;


public class Main {
	
	
	public void run() {
		
		/*
		//accedo al database
		String jdbcURL="jdbc:mysql://localhost/dizionario?user=root&password=ulla97";
		//connetto
		try {
		Connection conn=DriverManager.getConnection(jdbcURL);	//CREO UNA CONNESSIONE
		//Statement st=conn.createStatement();		//importare javaSQL, creo uno statement
		//eseguzione della query
		
		/*String sql="SELECT * FROM parola "+
				"WHERE nome LIKE 'Z%'";	//copio la query fissa sql scritta in heidiSQU
		*/
		
	//	String parola="gatto";
		/*
		String sql="SELECT * FROM parola "+"WHERE nome='"+parola+"'";
		*/
		/*
		String sql="SELECT * FROM parola "+"WHERE nome=?";
		PreparedStatement st=conn.prepareStatement(sql);
		st.setString(1, parola);
		ResultSet rs=st.executeQuery();
		
		//ResultSet rs=st.executeQuery(sql);	//la inserisco nel risultato
		//estrazione del risultato
		while(rs.next()) {
			int id=rs.getInt("id");		//per leggere i dati dell'id nel database
			String nome=rs.getString("nome");
			System.out.println(nome);		
		}
		
		conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		*/
		
		String parola="gatto";
		DizionarioDAO dao=new DizionarioDAO();
				if(dao.esisteParola(parola)) {		//se non metto ==false oppure ! vuol dire true
					System.out.format("la parola %s esiste", parola);
				}else {
					System.out.format("la parola %s  non esiste", parola);
				}
		
		
	}
	

	public static void main(String[] args) {		
		Main test=new Main();
		test.run();

	}

}
