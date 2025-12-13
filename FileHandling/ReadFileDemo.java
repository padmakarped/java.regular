package FileHandling;

import java.io.File;

public class ReadFileDemo {

    public static void main(String[] args) {

        try
        {
           File f1=new File("C:\\Users\\HP\\OneDrive\\Desktop\\sample11.txt");

           if(f1.createNewFile())
           {
              System.out.println("File Is Created Successfully"+f1.getName());
           }
           else{
                System.out.println("File Is Already Exits");
           }

        //    System.out.println("File Is Readable :"+f1.canRead());
        //    System.out.println("File Is Writable :"+f1.canWrite());
        //    System.out.println("File Is Executable :"+f1.canExecute());

           f1.setReadable(true);
           f1.setWritable(false);
           f1.setExecutable(false);

           System.out.println("File Is Readable :"+f1.canRead());
           System.out.println("File Is Writable :"+f1.canWrite());
           System.out.println("File Is Executable :"+f1.canExecute());

        }catch(Exception e)
        {
            System.out.println("output.txt");
        }
        
    }
    
}
