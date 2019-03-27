package it.polito.tdb.provaDB.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import it.polito.tdp.provaDB.model.Parola;

public class DizionarioDAO {

	
	public boolean esisteParola(String nome) {
		//String jdbcURL="jdbc:mysql://localhost/dizionario?user=root&password=ulla97";
		Connection conn=DBConnect.getConnection();
		try {
		//Connection conn=DriverManager.getConnection(jdbcURL);
		String sql="SELECT id, nome FROM parola WHERE nome=?";
		PreparedStatement st=conn.prepareStatement(sql);		//creo un oggetto di tipo PreparedStatement
		st.setString(1, nome);			//setto il primo ? a nome, passato come stringa nel metodo
		ResultSet rs=st.executeQuery();
		boolean result;
		if(rs.next()) {		//Siccome so che, se esiste la parola, c'è un unica riga nel dataBase che soddisfa la query allora, invece di creare un ciclo while, creo un if
			result= true;
		}else {
			result= false;
		}
		
		conn.close();
		
		return result;

		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	
	public List<Parola> listAll(){
		return null;
	}
	
	public void creaParola(Parola p) {
		
	}
	
	
}
