package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList L1=new ArrayList();
        L1.add(102);       //adding elements at the end of the list.
        L1.add("Amol");
        L1.add("male");
        L1.add(35);
        L1.add(35);
        L1.add(1,"shyam"); //adding element at specific index.

        ArrayList L2=new ArrayList<>();
        L2.add(1000);
        L2.add("padmakar");
        L2.add("narshing");
        L1.addAll(L2); //adding data from another arraylist.
        

        System.out.println(L1);

        Iterator itr = L1.iterator();
        while(itr.hasNext()) 
         {
               System.out.println(itr.next()); 
            
        }

        L1.set(2, "female"); //updating element at specific index.
        System.out.println("After updating:"+L1);

        
    }
    
}
