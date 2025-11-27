public class Customer {

    int amount=10000;

    synchronized void withdraw(int amount)
    {
        System.out.println("going To Withdraw....");

        if(this.amount<amount)
        {
            System.out.println("Less balance ,Waiting For Deposit");

            try{wait();}catch(Exception e){System.out.println(e);}
        }

        this.amount=amount;
        System.out.println("withdraw complete");
    }

    synchronized void Deposit(int amount)
    {
        System.out.println("Going To Deposit..");
        this.amount+=amount;
        System.out.println("Deposit Completed..");
        notify();
    }

    
}

 class TestITC {

    public static void main(String[] args) {

        final Customer c=new Customer();

        new Thread()
        {
            public void run()
            {
                c.withdraw(15000);
            }
        }.start();

        new Thread()
        {
        
            
            public void run()
            {
                c.Deposit(140000);
            }
        } .start();      
    }


    
}
