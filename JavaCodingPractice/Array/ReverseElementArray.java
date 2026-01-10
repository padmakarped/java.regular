package JavaCodingPractice.Array;

public class ReverseElementArray {

    public class ReverseArray {
    public static void main(String[] args) {


        int arr[]={45,12,78,23,85,56,78,96,57,85};

        int first=0;
        int last=arr.length-1;

        while(first<last)
        {
            int digits=arr[first];
            arr[first]=arr[last];
            arr[last]=digits;

            first++;
            last--;
        }

        System.out.print("Reversed Array Elements are:") ;

        for(int num : arr)
        {
            System.out.print(num+" ");
        }
;       
}

    
}
}
