import java.util.*;
 class one {
    public void print_swetha(){
        System.out.println("swetha");
    }
}
    class two extends one{
        public void print_thangamani(){
            System.out.println("Thangamani");
        }
    }
        public class SingleInheritance{
            public static void main(String[] args) {
                two g=new two();
                g.print_swetha();
                g.print_thangamani();
                g.print_swetha();

            }

        }

    

