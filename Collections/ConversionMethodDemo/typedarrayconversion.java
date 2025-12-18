package Collections.ConversionMethodDemo;

import java.util.ArrayList;

public class typedarrayconversion {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println("Elements in the ArrayList: " + list);

        // Converting ArrayList to Typed Array using toArray() method
        Integer[] array = list.toArray(new Integer[0]);

        // Displaying the elements of the typed array
        System.out.println("Elements in the typed array:");
        for (Integer num : array) 
        {
            System.out.println(num);
        }
    }
    
}
