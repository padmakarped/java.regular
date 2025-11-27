package Input.Output;

import java.io.FileOutputStream;

public class FileOutputStream {

     public static void main(String[] args) {
        try {
            
            // Create FileOutputStream to write data
            FileOutputStream fos = new FileOutputStream("\"C:\\Users\\HP\\OneDrive\\Desktop\\java\\text.txt\"");

            String data = "Hello, this is FileOutputStream example.";

            // Convert string into bytes
            byte[] bytes = data.getBytes();

            // Write bytes to file
            fos.write(bytes);

            System.out.println("Data written successfully!");

            // Close file
            fos.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }

    
}