package FileHandling.IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\DataOutputStreamDemo.txt");
            DataInputStream din = new DataInputStream(fin);

            int count = fin.available();
            byte[] b = new byte[count];

            din.read(b);

            for (byte bt : b) {
                char ch = (char) bt;
                System.out.print(ch + " ");
            }

            din.close();
            fin.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\nFile read successfully");
    }
}
