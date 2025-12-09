package FileHandling.IOStream;

public class TestIO {

    public static void main(String[] args) {
        
        System.out.println("Test OutPut Stream");

        System.err.println("Test Error Stream");

        try{
            int i=System.in.read();
            System.out.println((char)i);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    
}