package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
public  static Connection getconnection() {
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
				
			conn=DriverManager.getConnection("jdbc:mysql://localhost/java_training_1","root","");
			
				
				if(conn!=null){
					System.out.println("connection established");
				}
				
		
			
		} catch (Exception e) {
			
			 e.printStackTrace();
		}
		
		return conn;

}

}
