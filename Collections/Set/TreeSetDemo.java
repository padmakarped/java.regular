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
        hs.add(80);
        hs.add(90);
        hs.add(100);
        hs.add(110);
        hs.add(120);
        hs.add(130);
        hs.add(140);
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

        hs.pollFirst();
        System.out.println("Remove First Element :"+hs.pollFirst());

        hs.pollLast();
        System.out.println("Removes Last Element :"+hs.pollLast());

        System.out.println(hs);

        hs.descendingSet();
        System.out.println("Desending Treeset :"+hs.descendingSet());

        hs.headSet(100, true);
        System.out.println("Headset Element :"+hs.headSet(100, true));

        hs.tailSet(100, true);
        System.out.println("TailSet Element :"+hs.tailSet(100, true));

        hs.subSet(40, 100);
        System.out.println("SubSet Element :"+hs.subSet(40, 100));

        hs.higher(100);
        System.out.println("Find The Closest Element higher Of 100 :"+hs.higher(100));

        hs.lower(100);
        System.out.println("Find The Closest Element Lower Of 100 :"+hs.lower(100));


        TreeSet<Float> t1=new TreeSet<>();

        t1.add(10.f);
        t1.add(20.f);
        t1.add(30.f);
        t1.add(40.f);
        t1.add(50.f);

        System.out.println("Floating Values :"+t1);

        t1.ceiling(11.5f);//nearest of higher value
        System.out.println("Celling OF Float Value :"+t1.ceiling(11.5f));

        t1.floor(21.5f);//nearest of higher value
        System.out.println("Floor Of Float Value :"+t1.floor(21.5f));
    

        


        
    }
    }
    

