package Encapsulation;

public class EncapsulationDemo {

    private String username;
    private String password;
    
   public void setusername(String username)
   {
    if(password==null)
    {
        password="1010";
    }

    if(password.equals("1010"))
    {
    this.username=username;
    }
    else
    {
        System.out.println("Invalid password");
    }
   }

   public String getusername()
   {
    return username;
   }

   public void setpassword(String password)
   {

    if(username==null)
    {
        username="amol";
    }
    if(username.equals("amol"))
    {
        this.password=password;
    }
    else
    {
        System.out.println("Invalid username");
    }
   }

   public String getpassword()
   {
    return password;
   }
}

class test {

    public static void main(String[] args) {
        
        EncapsulationDemo e1=new EncapsulationDemo();
        e1.setusername("amol");
        System.out.println(e1.getusername());
        e1.setpassword("1010");
        System.out.println(e1.getpassword());
    }
}
