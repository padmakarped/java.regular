

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDB {

    public static void main(String[] args) {

        try {
        	
            // Step 1: Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","1010");

            // Step 3: Create SQL Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute SQL Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM person");

            // Step 5: Process ResultSet
            while (rs.next()) 
            {
                System.out.println(rs.getInt(1) + " " +rs.getString(2) + " " +rs.getInt(3));
            }

            // Step 6: Close resources
            rs.close();
            stmt.close();
            con.close();

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
