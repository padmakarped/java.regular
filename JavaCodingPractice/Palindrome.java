package JavaCodingPractice;

public class Palindrome {

    public static void main(String[] args) {
        
        String str="madam";

        StringBuilder reversed=new StringBuilder(str).reverse();

        if(str.equals(reversed.toString())) 
            {
            System.out.println(str + " is a palindrome.");
            } 
        else 
            {
            System.out.println(str + " is not a palindrome.");
            }


        // String str="madam";

        // StringBuilder reversed=new StringBuilder(str).reverse();

        // if(str.equals(reversed.toString()))
        // {
        //     System.out.println(str + "is a palindrome.");
        // }
        // else
        // {
        //     System.out.println(str +  "is not a palindrome.");
        // }
        
    }
    
}
