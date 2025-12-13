package JavaCodingPractice;

import java.util.Scanner;

public class FindLargestNo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.err.println("Enetr The First Number:");
        int a=sc.nextInt();

        System.out.println("Enetr The Second NUmber:");
        int b=sc.nextInt();

        System.out.println("Enter the Third Number:");
        int c=sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println("The Largest Of first Number is:"+a);
        }
        else if(b>=a && b>=c)
        {
            System.out.println("The Largest Of First Number is:"+b);
        }
        else
        {
            System.out.println("The Largest Of First Number is:"+c);
        }
    }
    
}
