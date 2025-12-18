package Collections.ArrayListOwnMethodsDemo;

import java.util.ArrayList;

public class ensureCapacity {

    public static void main(String[] args) {

         ArrayList<Integer> list = new ArrayList<>();

        // Ensure capacity for 20 elements
        list.ensureCapacity(20);

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        
      
    }
    
}
