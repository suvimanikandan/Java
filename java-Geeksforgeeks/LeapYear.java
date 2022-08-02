import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Year:");
    int year=input.nextInt();
    if((year%4==0)&&(year%100!=0)||(year%400==0))
    System.out.println("The specified year is leap year");
    else
    System.out.println("The Specified yearr is not leap year");

        
    }
}
