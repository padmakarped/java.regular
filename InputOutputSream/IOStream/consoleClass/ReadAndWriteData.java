package InputOutputSream.IOStream.consoleClass;

import java.io.Console;

public class ReadAndWriteData {

        public static void main(String[] args) {
        
        Console c=System.console();
        System.out.println("Enter your name: ");
        String name=c.readLine();

        System.out.println("Enter Your Password:");
        char[] ch=c.readPassword();
        String password=String.valueOf(ch);
        
        System.out.println("Welcome "+name);
        System.out.println("Your password is: "+password);
    }

    // public static void main(String[] args)
    //  {
    //     Console c=System.console();
    //     System.out.println("Enter your password: ");
    //     char[] ch=c.readPassword();
    //     String password=String.valueOf(ch);
    //     System.out.println("Your password is: "+password);
    // }
    
    

}
