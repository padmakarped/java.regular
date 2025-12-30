import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;

public class DatabaseMetadata {

    public static void main(String[] args) {
		
		try
		{
			//Step 1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			//Step 2: Create Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");
			
			//Step 3; Create Query
			DatabaseMetaData dbmd=con.getMetaData();
			
			System.out.println("Driver Name :"+dbmd.getDriverName());
			System.out.println("Driver Version :"+dbmd.getDriverVersion());
			System.out.println("Database Version :"+dbmd.getDatabaseProductVersion());
			System.out.println("Database Name :"+dbmd.getDatabaseProductName());
			System.out.println("database minor version :"+dbmd.getDatabaseMinorVersion());			
			//Step 5: Close Connection
			con.close();
			
		}catch(Exception i)
		{
			System.out.println(i);
		}
		
	}

    
}
