package Collections.ArrayListOwnMethodsDemo;

import java.util.ArrayList;

public class trimToSizeMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Size before trimToSize: " + list.size());

        list.trimToSize(); //trimToSize() method ==> reduces capacity to current size

        System.out.println("Size after trimToSize: " + list.size());
    }
    
}
