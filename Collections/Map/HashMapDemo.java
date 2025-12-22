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

        System.out.println("HashMap Of Keys And Values 6:"+m1);

        m1.put(6, "jon");
        System.out.println("After Updating"+m1);

        m1.size();
        System.out.println("Return Number Of entry :"+m1.size());

        m1.get(1);
        System.out.println("Return Value Of Given Key :"+m1.get(1));

        m1.remove(2);
        System.out.println("Remove Entry By Key :"+m1.remove(2));

        m1.remove(5, "Abhi");
        System.out.println("Remove Only If Both Match :"+m1.remove(1, "Abhi"));

        for(Map.Entry<Integer, String> entry : m1.entrySet())

        {
            // You can access entry.getKey() and entry.getValue() here
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        
    }
    
}
