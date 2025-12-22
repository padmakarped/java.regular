package Exception;

public class ThrowDemo2 {

    String name;
    int age;

    ThrowDemo2(String name, int age)
    {
        this.age=age;
        this.name=name;
    }

    void show()
    {
        if(age>18)
        {
            System.out.println("Your Age Is Valid Successfully Enroll For Fource");
        }
        else
        {
            throw new UnderAgeException("Your Age Is Under 18 So Can Not Able To Enroll For Cource:");
        }
    }

    public static void main(String[] args) {
        
        ThrowDemo2 t1=new ThrowDemo2("Akash", 19);
        t1.show();
        try
        {
             ThrowDemo2 t2=new ThrowDemo2("Akash", 15);
             t2.show();
        }
        catch(Exception i)
        {
           System.out.println(i.getMessage());
        }
    }
    
}

 class UnderAgeException extends RuntimeException {

    UnderAgeException(String msg)
    {
       super(msg);
    }

    
}
