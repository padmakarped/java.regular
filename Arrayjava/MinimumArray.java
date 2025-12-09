package Arrayjava;

import java.util.Scanner;

public class MinimumArray {

    public static void main(String[] args) 
    {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Size Of Array:");
    int size = sc.nextInt();

    int Arr[] = new int [size];
    System.out.println("Enter The array Of Element:");
    Arr[0]=sc.nextInt();
    int mini=Arr[0];

    for(int i=1; i<Arr.length; i++)
    {
        Arr[i] = sc.nextInt();

         if(Arr[i]<mini)
         {
             
             mini = Arr[i];
         }
          
    }
 
     System.out.println("Minimum Element In Array:"+mini);

    
  
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter the size of the array:");
//    int size = sc.nextInt();

//    int Arr[] = new int [size];
//    System.out.println("Enter The element of the array:");
//    Arr[0]=sc.nextInt();
//    int mini=Arr[0];

//    for(int i=1; i<Arr.length; i++)
//    {
//     Arr[i]=sc.nextInt();
//     if(Arr[i]>mini)
//     {
//         mini = Arr[i];
//     }
//    }
//    System.out.println("Find Out The Mini Array:"+mini);

















    }

   
    
}
