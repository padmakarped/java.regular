package Exception; 


public class ThrowDemo {

    double balance; // Instance variable to store account balance

    public ThrowDemo() 
    {
        balance = 5000; // Constructor initializes balance with 5000
    }

    public void Withdraw(double Amount)  // Method to withdraw money
    {

        if (Amount <= balance)
        {
            balance = balance - Amount; // Deduct withdrawal amount from balance

            System.out.println("Withdrawal Successfully : Remaining Balance:" + balance);
        }
        else
        {
            throw new InsufficientBalanceException("Balance Is Low In Your Account"); // throw keyword is used to raise a custom exception
        }
    }

    public static void main(String[] args) {

        ThrowDemo p1 = new ThrowDemo(); // Creating object of ThrowDemo
        try
        {
            p1.Withdraw(150000);// Trying to withdraw more than balance
        }
        catch (InsufficientBalanceException i)
        {
            System.out.println(i.getMessage()); // Catch block handles the custom exception
        }
    }
}


class InsufficientBalanceException extends RuntimeException {
    // Custom exception class
    // Extends RuntimeException → unchecked exception

    InsufficientBalanceException(String msg)
    {
        super(msg); // Passing message to parent class constructor
    }
}
