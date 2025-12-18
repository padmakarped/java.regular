package Collections.ConversionMethodDemo;

import java.util.ArrayList;

public class toArrayMethod {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println("Elements in the ArrayList: " + list);

        // Converting ArrayList to Array using toArray() method
        String[] array = list.toArray(new String[0]);

        // Displaying the elements of the array
        System.out.println("Elements in the array:");
        for (String fruit : array)
     {
            System.out.println(fruit);
        }
    }
    
}
