package JavaCodingPractice.Array;

public class FindSmallestArray {

    public static void main(String[] args) {
        

        int arr[]={45,78,56,78,52};
        int smallest=arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Element Of Array:"+smallest);
    }
}