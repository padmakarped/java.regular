import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.Types;

public class CallableStatementAreaOfCircle {

    public static void main(String[] args) {
		
		try {
        	
            // Step 1: Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");

            // Step 3: Create SQL Statement
            CallableStatement stmt=con.prepareCall("{call area_of_circle(?,?)}");
            stmt.setInt(1, 10);
            stmt.registerOutParameter(2, Types.DOUBLE);

            // Step 4: Execute SQL Query
            stmt.execute();
            System.out.println("Area Of Circle :"+stmt.getDouble(2));
            

            // Step 5: Close resources
            con.close();

        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    
    }
}
