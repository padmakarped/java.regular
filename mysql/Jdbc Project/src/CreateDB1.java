import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateDB1 {

    public static void main(String[] args) {
        

        try
        {
            //Step 1: Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step 2: Create Connection
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");

            //Step 3: Create Query
            PreparedStatement pst=con.prepareStatement("insert into person values(?,?,?)");
            pst.setInt(1,104);
            pst.setString(2, "narshing");
            pst.setInt(3, 25);

            //Step 4: Excute query
            int i=pst.executeUpdate();

            System.out.println("record inserted"+i);

            //Step 5: Close Connection
            con.close();


        }catch(Exception i)
        {
               System.out.println(i);
        }
    }
    
}
