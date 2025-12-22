package EnumDataType;

import java.awt.Color;
import java.util.Set;
import java.util.ArrayList;
import java.util.EnumSet;


enum colors {Green,Blue,Red,Yello,Purpul};

enum days{Monday,Tuesday,Thuresday,Wendsday,Friday,Saturday,Sunday};

public class EnumSetDemo {

    public static void main(String[] args) {

        Set<colors> s1 = EnumSet.allOf(colors.class);
        System.out.println("Name Of Colors :"+s1);

        Set<days> s2 = java.util.EnumSet.of(days.Monday, days.Sunday, days.Friday);
        System.out.println("Name Of Days :"+s2);

        Set<colors> s3 = EnumSet.noneOf(colors.class);
        System.out.println("Name Of Colors :"+s3);

        ArrayList<days> l1=new ArrayList<>();
        l1.add(days.Friday);
         l1.add(days.Sunday);
          l1.add(days.Monday);

          for(days d:l1)
          {
               System.out.println("Name Of Arraylist days :"+d);
          }

        

        
    }
    
}
