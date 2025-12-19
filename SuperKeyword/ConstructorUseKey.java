package SuperKeyword;

public class ConstructorUseKey {

    ConstructorUseKey ()
    {
      System.out.println("This Is The First Constructor");

    }
    
}

 class Child2 extends ConstructorUseKey{

    Child2()
    {
     super();
     System.out.println("This is second constructor");
    }

    public static void main(String[] args) {

        Child2 c1=new Child2();
    
        
    }
}
