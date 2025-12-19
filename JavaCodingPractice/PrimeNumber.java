package JavaCodingPractice;

public class PrimeNumber {

    public static void main(String[] args) {
        
    

//     int n=7, count = 0;

// for (int i = 1; i <= n; i++) {
//     if (n % i == 0)
//         count++;
// }

// if (count == 2)
//     System.out.println("Prime");
// else
//     System.out.println("Not Prime");






        for (int n = 1; n <= 10; n++) {
            int count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n);
            }
        }
    }
}








    
