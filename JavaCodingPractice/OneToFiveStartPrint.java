package JavaCodingPractice;

public class OneToFiveStartPrint {

    public static void main(String[] args)
    {

    int i=5;
    int j;

    for( i=1; i<=5; i++)
    {
        for( j=1; j<=i; j++ )
        {
            System.out.print("*");
        }
        System.out.println();
    }

    }


    
}
