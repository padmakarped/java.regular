package NonAccesModifier;

public abstract class abstractkey {

    // abstraction> security code hide
    //abstract method means incomplete code
    abstract void run(String username,String password); 





    
    
}



 class test extends abstractkey 
{

    @Override
    void run(String username, String password) 
    {
       
        if(username.equals("ram") && (password.equals("1010")))
        {
            System.out.println("Login Successfull");
        }
        else
        {
            System.out.println("Login Failed");
        }

    }

    public static void main(String[] args) {
        test t1=new test();
        t1.run("ram", "1010");
    }
}
