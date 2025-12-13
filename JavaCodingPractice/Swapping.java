package JavaCodingPractice;

import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The First number:");
        int num1=sc.nextInt();

        System.out.println("Enter The Second Number:");
        int num2=sc.nextInt();

        num1= num1+num2; 
        num2= num1-num2;  
        num1= num1-num2; 

        System.out.println("\nAfter Swapping Numbers: "+num1+"\nAfter Swapping Numbers: "+num2);




        

        
    }
    
}
