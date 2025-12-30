import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImgStore {

    public static void main(String[] args) {

        	try
		{
			//Step 1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			//Step 2: Create Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");
			
			//Step 3; Create Query
			PreparedStatement pst=con.prepareStatement("insert into imgtable(name,profile_pic) values(?,?)");
            pst.setString(1, "vishnu");
		
			
			FileInputStream input=new FileInputStream(("C:\\Users\\HP\\OneDrive\\Desktop\\core java\\padmakar.png.png"));
			pst.setBinaryStream(2, input);
			
			
			//Step 4: Execute Query
			int i=pst.executeUpdate();
			
		 if(i > 0)
		 {
			 System.out.println("Data Inserted Successfully");
		 }
			
			//Step 5: Close Connection
			con.close();
			
		}catch(Exception i)
		{
			System.out.println(i);
		}
        
    }
    
}
