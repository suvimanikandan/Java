import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1=input.nextInt();
        System.out.println("Enter num2:");
        int num2=input.nextInt();
        int answer=num1+num2;
        System.out.println("Addition of two numbers is"+answer);
    }
}
