package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        
        HashMap<Integer, String> m1 = new HashMap<Integer, String>();

        m1.put(1, "Amol");
        m1.put(2, "Anil");
        m1.put(3, "Krushna");
        m1.put(4, "Omkar");
        m1.put(5, "Abhi");

        System.out.println("HashMap Of Keys And Values:"+m1);

        for(Map.Entry<Integer, String> entry : m1.entrySet())

        {
            // You can access entry.getKey() and entry.getValue() here
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        
    }
    
}
