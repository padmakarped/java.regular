package FileHandling;

import java.io.File;

public class DeleteFile {

    
    public static void main(String[] args) {
        
    
    try
        {

        File f1=new File("\\Users\\HP\\OneDrive\\Desktop\\sample.txt");

         if(f1.delete())
         {
            System.out.println("File Is Delete Successfully"+f1.getName());
         }
    else
        {
               System.out.println("File Is Already Delete");
        }
    
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    
    }
    
}

