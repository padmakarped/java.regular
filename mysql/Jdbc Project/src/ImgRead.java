import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Blob;

public class ImgRead {


    public static void main(String[] args) {
        
        	try
		{
			//Step 1: Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			//Step 2: Create Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");
			
			//Step 3; Create Query
			PreparedStatement pst=con.prepareStatement("select * from imgtable");

            ResultSet rs=pst.executeQuery();

            if(rs.next())
            {
                Blob b=rs.getBlob(2);
                byte barr[]=b.getBytes(1,(int)b.length());

                FileOutputStream out=new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\core java\\padmakar.png.png");
                 
                out.write(barr);

                out.close();
            }

            //Step 4:Connection Close
            pst.close();
            con.close();
			
		}catch(Exception i)
		{
			System.out.println(i);
		}
        
    }
    
}

 

    

