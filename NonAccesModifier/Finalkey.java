package NonAccesModifier;

public final class Finalkey {

   final void run()
    {
        final int a=10;
        // a=20; // final variable value not change
        System.out.println("Final Variable Value:"+a);
    }
    
}

 class test extends Finalkey
 {
    public static void main(String[] args) {
        test t1=new test();
        t1.run();
    }



    
}
