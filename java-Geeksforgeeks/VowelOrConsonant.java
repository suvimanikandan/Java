import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the character:");
        char y=input.next().charAt(0);
        if(y=='a'||y=='e'||y=='o'||y=='i'||y=='u'){
            System.out.println("Enter character is vowel");
        }
        else
        System.out.println("Entered character is consonant");


        
    }
}
