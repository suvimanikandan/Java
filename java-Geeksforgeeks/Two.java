import java.util.Scanner;

//get input from userr
public class Two {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter number:");
    int num=input.nextInt();
    
    System.out.println("Enter float value:");
    float values=input.nextFloat();

    System.out.println("Enter String:");
    String sentence=input.next();

    
    System.out.println("You entered the float value:"+values);
    System.out.println("You entered the number:"+num);
    System.out.println("You entered the string:" +sentence);


}    
}
