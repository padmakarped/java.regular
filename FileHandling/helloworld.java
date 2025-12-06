package FileHandling;



public class helloworld {
   
int a=10;

public void run()
{
    System.out.println("this is Numeric Value....");
}

public void run(int a)
{
    System.out.println("This IS Second Numeric value....");
}

public static void main(String[] args) {
    
    helloworld m1=new helloworld();
    m1.run(10);
}
}