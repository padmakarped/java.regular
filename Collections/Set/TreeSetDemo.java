package Collections.Set;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        

         TreeSet<Integer> hs=new TreeSet<>();

        hs.add(50);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);
        // hs.add(null);==> TreeSet Does Not Allow Null Value

        System.out.println("TreeSet Integer"+hs);

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
    

