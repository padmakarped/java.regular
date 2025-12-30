import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingDemo {

    public static void main(String[] args) {
		
		
		 try {
	        	
	            // Step 1: Register Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Step 2: Create Connection
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");
	            con.setAutoCommit(false); 
	            
	            // Step 3: Create SQL Statement
	            Statement stmt = con.createStatement();

	            // Step 4: Execute SQL Query
	            stmt.addBatch("insert into person (id,name,age) values(111,'prasad',56)");
	            
	            stmt.addBatch("insert into person (id,name,age) values (112,'abhi',45)");

	           // Step 5: execute a query
	            stmt.executeBatch();
	            
	            
	            // Step 6: Close resources
	            con.commit();
	            System.out.println("success");
	            con.close();

	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	}
    
}
