import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PdfFileStoreDemo {

    public static void main(String[] args) {
        
        	try
		{
			//Step 1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			//Step 2: Create Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");
			
			//Step 3; Create Query
			PreparedStatement pst=con.prepareStatement("insert into pdffile(pdfname,pdfdata) values(?,?)");
            pst.setString(1, "File");
		
			
			FileInputStream input=new FileInputStream(("C:\\core java\\File.pdf"));
			pst.setBinaryStream(2, input);
			
			
			//Step 4: Execute Query
			int i=pst.executeUpdate();
			
		 if(i > 0)
		 {
			 System.out.println("Pdf File Inserted Successfully");
		 }
			
			//Step 5: Close Connection
            input.close();
            pst.close();
			con.close();
			
		}catch(Exception i)
		{
			System.out.println(i);
		}
        
    }
    
}
