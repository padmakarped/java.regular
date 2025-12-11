

package InputOutputSream.IOStream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {

        try {
            // Create FileOutputStream objects for multiple files
            FileOutputStream fout1 = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\LC1.txt");
            FileOutputStream fout2 = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\LC2.txt");
            FileOutputStream fout3 = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\LC3.txt");

            // Create ByteArrayOutputStream object
            ByteArrayOutputStream bout = new ByteArrayOutputStream();

            // Write bytes in memory
            bout.write(65);  // 'A'
            bout.write(66);  // 'B'
            bout.write(67);  // 'C'

            // Write memory data into multiple files
            bout.writeTo(fout1);
            bout.writeTo(fout2);
            bout.writeTo(fout3);

            bout.flush();
            bout.close();

            fout1.close();
            fout2.close();
            fout3.close();

            System.out.println("Successfully written to all files!");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
