package ObjectClass;

public class ObjectClassDemo {

    public static void main(String[] args) {
        
        ObjectClassDemo d1=new ObjectClassDemo();

        System.out.println(d1.toString());

        Integer d2=new Integer(10);
        Integer d3=new Integer(10);

        System.out.println(d1.equals(d3));

        String s1=new String("Amol");
        String s2=new String("Anil");

        System.out.println(s1.equals(s2));

        System.out.println(s1.getClass().getName());
        System.out.println(d1.getClass().getName());
        System.out.println(d2.getClass().getPackageName());
    }
    
}
