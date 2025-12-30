
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TextStore {

    public static void main(String[] args) {
        
        try
        {
           //Step 1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			//Step 2: Create Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");
			
			//Step 3; Create Query
			PreparedStatement pst=con.prepareStatement("insert into text_store(id,content) values(?,?)");
            pst.setInt(1, 101);
		
			
			//Step 4: Read Text File
            FileReader reader = new FileReader("C:/core java/store.txt");

            pst.setCharacterStream(2, reader);
			
			
			//Step 5: Execute Query
			int i=pst.executeUpdate();
			
		 if(i > 0)
		 {
			 System.out.println("Text File Stored Successfully");
		 }
			
			//Step 6: Close Connection
            reader.close();
			con.close();

        }catch(Exception i)
        {
            System.out.println(i);
        }
    }
    
}
