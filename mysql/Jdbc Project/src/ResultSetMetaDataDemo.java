import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ResultSetMetaDataDemo {

    public static void main(String[] args) {

        try {
            // Step 1: Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/javadb", "root", "1010");

            // Step 3: Create SQL Query
            PreparedStatement pst = con.prepareStatement(
                    "select * from person");

            // Step 4: Execute Query
            ResultSet rs = pst.executeQuery();

            // Step 5: Get ResultSetMetaData object
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("Total No Of Columns : " + rsmd.getColumnCount());
            System.out.println("Name Of First Column : " + rsmd.getColumnName(1));
            System.out.println("Data Type Of First Column : " + rsmd.getColumnTypeName(1));
            System.out.println("Column Display Size : " + rsmd.getColumnDisplaySize(1));
            System.out.println("Table Name : " + rsmd.getTableName(1));
            System.out.println("Column Label : " + rsmd.getColumnLabel(1));

            // Step 6: Close Connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
