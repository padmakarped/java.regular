package Collections.Map;

import java.util.TreeMap;
import java.util.Map;


public class TreeMapDemo {

     public static void main(String[] args) {

        TreeMap<Integer,String> m1=new TreeMap<Integer,String>();

        m1.put(1, "Amol");
        m1.put(2, "Anil");
        m1.put(3, "Krushna");
        m1.put(4, "Omkar");
        m1.put(5, "Abhi");

        System.out.println("TreeMap Of Keys And Values:"+m1);

        for(Map.Entry<Integer,String> entry : m1.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        
    }

    
}
