import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        //Perimeter of rectangle ABCD = 2A + 2B = 2(A+B)
        int length,breadth;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length:");
        int A=input.nextInt();
        System.out.println("Enter breadth:");
        int B=input.nextInt();
        int result=2*(A+B);
        System.out.println("perimeter of the rectangle"+result);




    }
}
