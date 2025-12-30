import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {
	
	public static void main(String[] args) {
		
		try
		{
			//Step 1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			//Step 2: Create Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");
			
			//Step 3; Create Query
			PreparedStatement pst=con.prepareStatement("insert into person values(?,?,?)");
			pst.setInt(1, 104);
			pst.setString(2,"padmkar");
			pst.setInt(3, 23);
			
			//Step 4: Execute Query
			int i=pst.executeUpdate();
			
			System.out.println(i+"Record Inserted");
			
			//Step 5: Close Connection
			con.close();
			
		}catch(Exception i)
		{
			System.out.println(i);
		}
		
	}

}
