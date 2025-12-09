package FileHandling.IOStream;

import java.io.File;

public class Fileinfo {

    public static void main(String[] args) {
         
        File f=new File("\\Users\\HP\\OneDrive\\Desktop\\LC.txt");

        if(f.exists())
        {
          System.out.println("File Name :"+f.getName()); 
          System.out.println("File Location :"+f.getAbsolutePath());
          System.out.println("File Readable :"+f.canRead()); 
          System.out.println("File Writable :"+f.canWrite());
          System.out.println("File Size :"+f.length());
        
        }
        else
        {
          System.out.println("File Doesn't Exits..");
        }

    }
    
}
