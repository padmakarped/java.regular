package Exception;

public class ExceptionHandle {

    public static void main(String[] args) {
			
		try {
			
			int Arr[] = {10,20,30};
			System.out.println(Arr[1]);
			int a=10, b=0;
			System.out.println(10/0); // This line causes an exception and makes the following code unreachable
			// String name=null;
			// System.out.println(name.length());
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("No Index 11th Present In Array");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do Not Divide With Zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("On Null You Can Not Call Method");		
		}
		
	}
    
}
