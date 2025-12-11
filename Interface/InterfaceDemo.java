package Interface;

 interface Test1  
{
    void show();
}


interface Test2 
{
    void show();
}
interface Test3 
{
    void show();
}

public class InterfaceDemo implements Test1,Test2,Test3 {

    @Override
    public void show() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Test2 t2 = new InterfaceDemo();
        t2.show();

        Test1 t1=new InterfaceDemo();
        t1.show();
    

        Test3 t3=new InterfaceDemo();
        t3.show();

        InterfaceDemo id=new InterfaceDemo();
        id.show();
    }
}

    


