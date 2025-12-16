package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonInfo {

    int id;
    String name;
    int age;
    String city;

     PersonInfo(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
}

 class TestPersonList {

    public static void main(String[] args) {

        PersonInfo p1=new PersonInfo(101,"omkar",25,"pune");
        PersonInfo p2=new PersonInfo(102,"ram",30,"mumbai");
        PersonInfo p3=new PersonInfo(103,"sham",28,"nagpur");   
        PersonInfo p4=new PersonInfo(104,"rahul",27,"banglore");

       ArrayList<PersonInfo> personList = new ArrayList<PersonInfo>();
            personList.add(p1);
            personList.add(p2);
            personList.add(p3);
            personList.add(p4);

            Iterator<PersonInfo> itr = personList.iterator();
            while(itr.hasNext()) 
            {
                PersonInfo p = itr.next();
                System.out.println("ID: " + p.id + ", Name: " + p.name + ", Age: " + p.age + ", City: " + p.city);
            }
        
    }

    
}
