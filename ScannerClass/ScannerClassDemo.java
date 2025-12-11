package ScannerClass;

import java.util.Scanner;

public class ScannerClassDemo {

    public static void main(String[] args) 
    {

        //next():-it is used to read string input from the user until space is encountered.The Methods Start With Next Are Use To Take Input From User.
        //nextline():-is is allow to take string input as a sentence(line).
        
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter Your Name:");
        // String name=sc.next();

        // System.out.println("Your Name Is:"+name);


    ////hasNext()==> tells you “Is something available to read.It does not read the data; it only checks.and returns true or false.
    /// hasNextLine()==>it checks whether there is another line available in the input or not.
    /// hasNextInt()==>it checks whether there is another integer available in the input or not.
    /// hasNextDouble()==>it checks whether there is another double available in the input or not.
    /// hasNextBoolean()==>it checks whether there is another boolean available in the input or not.
    /// hasNextFloat()==>it checks whether there is another float available in the input or not.

        // Scanner sc=new Scanner(" Hello Navin Patil 45");
        // System.out.println(sc.nextLine());

        // while (sc.hasNext()) 
        // {
        //   System.out.println(sc.nextLine());   
        // }



        // Scanner sc=new Scanner("  Hello Navin Patil 45 ");

        // while ((sc.hasNext()))
        //     {
        //         if(sc.hasNextInt())
        //         System.out.println(sc.next());
        //      else
        //         sc.next();
            

        //     } 

        ///hasnexttoken()==>it checks whether there is another token available in the input or not.
         
        Scanner sc=new Scanner(" Hello Navin Patil 45 ");

        boolean hasNextToken=sc.hasNext();
        System.out.println("Does my Next Token exist:"+hasNextToken);
        
            
            
        

        
    }
    
}
