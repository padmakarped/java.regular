package Collections.SetSpecificMethodsDemo;

import java.util.HashSet;

public class containMethod {

    public static void main(String[] args) {
        
       HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Elements in the set: " + set);

        // Using contains() to check for specific elements
        boolean contains20 = set.contains(20);
        boolean contains40 = set.contains(40);
        
        System.out.println("Does the set contain 20? " + contains20);
        System.out.println("Does the set contain 40? " + contains40);
    }
    
}
