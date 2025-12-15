package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsObject {

    public static void main(String[] args) {
        
          ArrayList<String> L1=new ArrayList<String>();
        L1.add("ram");
        L1.add("Amol");
        L1.add("male");
        L1.add("female");
        L1.add("ram");


        System.out.println(L1);

        Iterator itr = L1.iterator();
        while(itr.hasNext()) 
         {
               System.out.println(itr.next()); 
            
        }
    }
    
}
