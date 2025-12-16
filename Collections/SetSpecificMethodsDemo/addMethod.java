package Collections.SetSpecificMethodsDemo;

import java.util.HashSet;

public class addMethod {

    public static void main(String[] args) {
        

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Elements in the set before add: " + set);

        // Using add() to attempt to add duplicate elements
        boolean add1 = set.add(20); // This will not be added
        boolean add2 = set.add(40); // This will be added
        System.out.println("Was 20 added again? " + add1);
        System.out.println("Was 40 added? " +add2 );

        System.out.println("Elements in the set after add: " + set);
    }
    
}
