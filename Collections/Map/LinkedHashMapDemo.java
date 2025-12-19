package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> m1=new LinkedHashMap<Integer,String>();

        m1.put(1, "Amol");
        m1.put(2, "Anil");
        m1.put(3, "Krushna");
        m1.put(4, "Omkar");
        m1.put(5, "Abhi");

        System.out.println("LinkedHashMap Of Keys And Values:"+m1);

        for(Map.Entry<Integer,String> entry : m1.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        m1.remove(3);
        System.out.println("Upadating For Using Remove :"+m1);

        m1.keySet();
        System.out.println("Display On Only Key Values :"+m1.keySet());

        m1.containsValue("amol");
        System.out.println("AMol Is Exists :"+m1.containsValue("Amol"));

        m1.get(2);
        System.out.println("Get Is 2 :"+m1.get(2));

        m1.replace(2, "narshing");
        System.out.println("Replace The Value 2 key location :"+m1.replace(2, "narshing"));

        System.out.println(m1);

       



        
        
    }

    
}