package Collections.List.Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> s1= new Stack<>();

        boolean result= s1.empty(); // to check stack is empty or not
        System.out.println("Is stack empty: "+ result);

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);


        System.out.println("Elements in stack: "+ s1);

        s1.peek(); // views top element without removing
        System.out.println("Element at top using peek: "+ s1.peek());

        s1.search(40); // searches element position from top
        System.out.println("Position of element : "+ s1.search(40));

    

        s1.pop(); // removes top element
        s1.pop();
        System.out.println("Elements in stack after pop: "+ s1.pop());
        System.out.println("Element in stack after pop :"+s1.pop()); 

        

    

        

        




        
    }
    
}
