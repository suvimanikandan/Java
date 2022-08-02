import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Entered num1:");
        int num1=input.nextInt();
        System.out.println("Entered num2:");
        int num2=input.nextInt();
        System.out.println("Entered num3");
        int num3=input.nextInt();
        if(num1>=num2){
            if(num1>=num3)
            System.out.println("num1 is largest number");
            else
            System.out.println("num3 is the largest number");
        }
        else{
            if(num2>=num3)
            System.out.println("num2 is the largest number");
            else
            System.out.println("num3 is the largest number");

        }
    }
}
