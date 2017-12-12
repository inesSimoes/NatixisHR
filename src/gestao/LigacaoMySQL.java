package gestao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

import java.util.Properties;


public class LigacaoMySQL {
	
	public Connection getConnnection() throws SQLException{
		    
		    String url = "jdbc:mysql://localhost:3306/natixishr";
	        Properties props = new Properties();
	        props.setProperty("user", "root");
	        props.setProperty("password", "");
	        
	        Connection conn = (Connection) DriverManager.getConnection(url,props);
		
		return conn;
	}
	
	
}
