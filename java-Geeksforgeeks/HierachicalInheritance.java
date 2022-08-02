    class A{
        public void print_A(){
            System.out.println("Class-A");
        }
    }
    class B extends A{
        public void Print_B(){
            System.out.println("Class-B");
        }
    }
    class C extends A{
        public void Print_C(){
           System.out.println("Class-C");
        }
    }
    class D extends A{
        public void Print_D(){
            System.out.println("Class-D");
        }
    }
    public class HierachicalInheritance {
        public static void main(String[] args) {
            B obj_B=new B();
            obj_B.print_A();
            obj_B.Print_B();

            C obj_c=new C();
            obj_c.print_A();
            obj_c.Print_C();

            D obj_D=new D();
            obj_D.print_A();
            obj_D.Print_D();
        }

}
