package WrapperClassDemojava;

public class Unboxing {

    public static void main(String[] args) {
        
        Integer s=new Integer(10);

        int x=s.intValue(); //unboxing 

        int y=s; //unboxing

        System.out.println("x:"+x+" y:"+y);
    }
    
}
