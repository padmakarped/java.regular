package Exception;

public class ThrowDemo1 {

    double balance;

    ThrowDemo1()
    {
        balance=1000;
    }

    public void withdraw(double amount)
    {
        if(amount<+1000)
        {
           balance=balance-amount;
           System.out.println("Remaining Balance :"+balance); 
        }
        else 
        {
          throw new InvalidAmountException("Balance Is Not Available In Your Account :");
        }
    }

    public static void main(String[] args) {
        
        ThrowDemo1 t1=new ThrowDemo1();
        try
        {
            t1.withdraw(2000);
        }
        catch(InvalidAmountException i)
        {
            System.out.println(i.getMessage());
        }
        
        
    }
    
}

class InvalidAmountException extends RuntimeException{

    InvalidAmountException (String msg)
    {
        super(msg);
    }

}
