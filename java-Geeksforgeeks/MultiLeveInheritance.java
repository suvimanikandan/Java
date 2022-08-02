    class one{
        public void print_swetha(){
            System.out.println("Swetha");
        }
    }
        class two extends one{
            public void print_thangamani(){
                System.out.println("Thangamani");
            }
        }
        class three extends two{
            public void print_thangamalar(){
                System.out.println("Thangamalar");
            }
        }
        public class MultiLeveInheritance{
             public static void main(String[] args) {
                three g=new three();
                g.print_swetha();
                g.print_thangamani();
                g.print_thangamalar();
             }
        }
        
    
    

