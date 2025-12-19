package SuperKeyword;

public class VariableDemoUseKey {

int num=20;
 
}

class Child extends VariableDemoUseKey {

    int number=40;

    void Display()
    {
        System.out.println(number); //child variable 
        System.out.println(super.num+number);  //parent variable   
    }

    public static void main(String[] args) {

        Child c1=new Child();
        c1.Display();

        
    }


    
}
