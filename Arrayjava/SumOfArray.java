package Arrayjava;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        
        //Take The array sise..
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Size Of The Array:");
     int size=sc.nextInt();

     //Input Array Element
     int Arr[] = new int [size];
     int sum=0;
     System.out.println("Enter Array Element:"+size);
    

     for(int i=0; i<size; i++)
     {
        Arr[i] = sc.nextInt();
        sum += Arr[i]; //Add Each element To Sum..
     }

     //Print The Sum..
     System.out.println("Sum Of Array Element:"+sum);
    


//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter The array Element Size:");
//    int size = sc.nextInt();

//        int Arr [] = new int [size];
//        int sum = 0;
//        System.out.println("Enter The Array Of Element");

//        for(int i=0; i<size; i++)
//        {
//         Arr[i]=sc.nextInt();
//         sum+=Arr[i];
//        }
//        System.out.println("Sum Of Element:"+sum);






// Scanner sc=new Scanner(System.in);
// System.out.println("Enter The Size Of array:");
// int size=sc.nextInt();

// int arr[]= new int[size];
// int sum=0;
// System.out.println("Etnet The Array:");

// for(int i=0; i<size; i++)
// {
//     2
//     arr[i] = sc.nextInt();
//     sum += arr[i];
// }
// System.out.println("Sum of the arry:"+sum);






// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the size of the array:");
// int size = sc.nextInt();

// int arr[] = new int [size];
// int sum=0;
// System.out.println("Enter The Array");

// for(int i=0; i<size; i++)
// {
//     arr[i] = sc.nextInt();
//     sum+=arr[i];
// }
// System.out.println("sum of array:"+sum);










    
    }   
}
