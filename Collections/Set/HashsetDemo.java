package Collections.Set;

import java.util.HashSet;

public class HashsetDemo {

    public static void main(String[] args) {

        HashSet<Integer> hs=new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(null);//hashset have allow null value

        System.out.println("HashSet Integer"+hs);

         hs.add(60);
        System.out.println("Adding Element :"+hs);

        hs.clone();
        System.out.println("Create A Copy Of Collection :"+hs.clone());

        hs.contains(10);
        System.out.println("Object is part Of collection Or not :"+hs.contains(10));

        hs.isEmpty();
        System.out.println("Verifiy Collection Empty Or Not :"+hs.isEmpty());

        hs.remove(20);
        System.out.println("Removes At Element :"+hs);

        hs.size();
        System.out.println("Get The Size Of collection :"+hs.size());


        
    }
    
}
