package JavaCodingPractice;

import java.util.Scanner;

public class OddEven {

   public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number;");
    int num1=sc.nextInt();
    if(num1 % 2 == 0)
    {
        System.out.println("The Number Is Even:"+num1);
    }
    else{
        System.out.println("The Number Is Odd:"+num1);
    }
    
   }

    
}
