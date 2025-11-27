package FileHandling.Output;

import java.io.File;

public class createFile {

    public static void main(String[] args) {
        
        File f=new File("\\Users\\HP\\OneDrive\\Desktop\\LC.txt");

    try
    {
        if(f.createNewFile())
        {
            System.out.println("file is successfully created");
        }
        else
        {
            System.out.println("file already exit");
        }
    }
    catch(Exception e)
    {
       System.out.println("Exception handle");
    }
    }

    
}