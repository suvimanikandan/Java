import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        int sum=0,n;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to check:");
        int num=input.nextInt();
        int square=num*num;
        while(square!=0){
           int digit=square%10;
           sum=sum+digit;
           square=square/10;
        }
        if(num==sum){
            System.out.println("The Entered number is Neon Number");

        }
        else
    {
        System.out.println("The Entered Number is not a Neon number");
    }
    }
}
