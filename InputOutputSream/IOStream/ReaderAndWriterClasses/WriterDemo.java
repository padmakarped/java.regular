package InputOutputSream.IOStream.ReaderAndWriterClasses;

import java.io.FileWriter;
import java.io.Writer;

public class WriterDemo {

    public static void main(String[] args) {
        
        try
        {
             Writer w=new FileWriter("output.txt");
             String data="I love You Shubhdya.\n";
              w.write(data);
              w.append("Take Care Of Yourself my Love.\n");
              w.close();
              System.out.println("Data written to file successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
