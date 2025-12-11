package FileHandling;

import java.io.File;

public class FileCreateDemo {

    public static void main(String[] args) {


        try
        {

        File f1=new File("\\Users\\HP\\OneDrive\\Desktop\\sample.txt");

         if(f1.createNewFile())
         {
            System.out.println("File Is Created Successfully"+f1.getName());
         }
    else
        {
               System.out.println("File Is Already Exits");
        }
    
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }


        
    }
    
}
