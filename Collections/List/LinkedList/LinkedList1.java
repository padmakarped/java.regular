package Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> l1=new LinkedList<String>();

        l1.add("amol");
        l1.add("swapnil");
        l1.add("vaibhav");
        l1.add("sanket");

        System.out.println("Before LinkedList :"+l1);

        l1.addFirst("kiran"); //adding element at first position
        l1.addLast("sandip"); //adding element at last position
        l1.push("bhaurao");  //adding element at first position

        System.out.println("After LinkedList :"+l1);

        l1.get(4); //getting element at index 4
        l1.getFirst(); //getting first element
        l1.getLast(); //getting last element

        System.out.println("Element at index 4: "+l1.get(4));
        System.out.println("First Element: "+l1.getFirst());
        System.out.println("Last Element: "+l1.getLast());

        l1.peek(); //viewing head element
        l1.peekFirst(); //viewing first element
        l1.peekLast(); //viewing last element

        System.out.println("Head Element using peek(): "+l1.peek());
        System.out.println("First Element using peekFirst(): "+l1.peekFirst());
        System.out.println("Last Element using peekLast(): "+l1.peekLast());

        l1.remove(); //removing head element
        l1.remove(0); //removing element at index 0
        l1.removeFirst(); //removing first element
        l1.removeLast(); //removing last element

        System.out.println("LinkedList after remove operations: "+l1.remove(0));
        System.out.println("LinkedList after removeFirst(): "+l1.removeFirst());
        System.out.println("LinkedList after removeLast(): "+l1.removeLast());

        l1.contains("amol");//to check element is present or not
        l1.indexOf("amol"); //to get index of element
        l1.size(); //to get size of linkedlist
        l1.toArray(); //converting linkedlist to array
        l1.offer("amol"); //adding element at last
        l1.offerFirst("swapnil"); //adding element at first
        l1.offerLast("vaibhav"); //adding element at last

        System.out.println("Does LinkedList contain 'amol'? : "+l1.contains("amol"));
        System.out.println("Index of 'amol' in LinkedList: "+l1.indexOf("amol")); 
        System.out.println("Size of LinkedList: "+l1.size());
        System.out.println("LinkedList to Array: "+java.util.Arrays.toString(l1.toArray()));
        System.out.println("LinkedList after offer(): "+l1.offer("amol"));
        System.out.println("LinkedList after offerFirst(): "+l1.offerFirst("swapnil"));
        System.out.println("LinkedList after offerLast(): "+l1.offerLast("vaibhav"));      


       

        
    }
    
}
