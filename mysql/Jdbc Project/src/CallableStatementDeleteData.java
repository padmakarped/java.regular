import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;

public class CallableStatementDeleteData {

    public static void main(String[] args) {
		
		  try {
	        	
	            // Step 1: Register Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Step 2: Create Connection
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");

	            // Step 3: Create SQL Statement
	            CallableStatement stmt=con.prepareCall("{call delete_from_person(?)}");
	            stmt.setInt(1, 102);

	            // Step 4: Execute SQL Query
	            stmt.execute();
	            System.out.println("Deletion Successfully");

	            // Step 5: Close resources
	            con.close();

	        } 
	        catch (Exception e) 
	        {
	            System.out.println(e);
	        }
	}
    
}
