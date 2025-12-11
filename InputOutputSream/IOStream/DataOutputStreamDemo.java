package InputOutputSream.IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

    public static void main(String[] args)  {
        try{
        FileOutputStream fout=new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\DataOutputStreamDemo.txt");
        DataOutputStream dout=new DataOutputStream(fout);
        dout.writeInt("sudhanshu".length());
        dout.writeDouble(99.99);
        dout.flush();
        dout.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("file created successfully");
    }
    
}
