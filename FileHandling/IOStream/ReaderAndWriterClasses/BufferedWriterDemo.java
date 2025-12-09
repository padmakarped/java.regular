package FileHandling.IOStream.ReaderAndWriterClasses;

import java.io.FileWriter;
import java.io.Writer;
import java.io.BufferedWriter;


public class BufferedWriterDemo {


     public static void main(String[] args) {
        
        try
        {
             Writer w=new FileWriter("output1.txt");
             BufferedWriter bw=new BufferedWriter(w);
             String data="I love You Shubhdya.\n";
              w.write(data);
              w.append("Take Care Of Yourself my Love.\n");
              bw.close();
              System.out.println("Data written to file successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    



    
}