package FileHandling.IOStream;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutputStreamDemo {

    public static void main(String[] args) { 
        try{
        FileOutputStream fout=new FileOutputStream("\\Users\\HP\\OneDrive\\Desktop\\LC.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to BufferedStream.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
          }
          catch(Exception e)
          {
            System.out.println(e);
          }
        System.out.println("File writte successfully");



        
    }
    
}
