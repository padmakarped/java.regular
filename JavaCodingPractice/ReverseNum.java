package JavaCodingPractice;

public class ReverseNum {

    public static void main(String[] args) {
        
    

    int num=123;
    int rev=0;

       while(num!=0)
        {
            int digit=num % 10; //3;2;1
            rev=rev*10 + digit; //0*10+3=3; 3*10+2=32; 32*10+1=321
            num=num/10; //12;1;0
        }
        System.out.println("Reversed Number is:"+rev);
    }




    }




















    

