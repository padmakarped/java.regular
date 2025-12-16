package Collections.SetSpecificMethodsDemo;

import java.util.HashSet;

public class removeMethod {

    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("Elements in the set before remove: " + set);

        // Using remove() to delete element 30
        set.remove(30);
        System.out.println("Elements in the set after remove: " + set);
    }
    
}
