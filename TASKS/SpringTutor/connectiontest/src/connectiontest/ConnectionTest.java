package connectiontest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String args[]){
		try { 
			 
	          //step1 load the driver class  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	              
	            //step2 create  the connection object  
//	            Connection con=DriverManager.getConnection(  
//	            "jdbc:oracle:thin:@10.237.59.104:1521:MEERKAT","meerkat","meerkat");
//	            Connection con=DriverManager.getConnection(  
//	                    "jdbc:oracle:thin:@//10.238.110.130:1521/DEVMRK","meerkat","meerkat");
//	             
	            
	            String dbURL = "jdbc:oracle:thin:@10.238.110.130:1521/DEVMRK"; 
	            String strUserID = "meerkat"; 
	            String strPassword = "meerkat"; 
	            Connection myConnection=DriverManager.getConnection(dbURL,strUserID,strPassword);
	            Statement st = myConnection.createStatement();
	            
	            
	            System.out.println("Connection successfull");
	           // Statement st = con.createStatement(); 
	             
	            

	            myConnection.close(); 
	        } catch (Exception e) { 
	            System.err.println("Got an exception! "); 
	            System.err.println(e.getMessage()); 
	        }
	}
}
