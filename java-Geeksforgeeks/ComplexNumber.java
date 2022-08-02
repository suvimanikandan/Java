//add two complex numbers
public class ComplexNumber {
        int real,image;
        public ComplexNumber(int r,int i){
            this.real=r;
            this.image=i;
        }
            //function to print the real number
            public void showC(){
                System.out.print(this.real + "+i"+  this.image);
            }
                public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2){
                 
                  ComplexNumber res=new ComplexNumber(0,0);
                    //adding to the real part of the complex number 
                    res.real=n1.real=n2.real;
                    //adding imaginary part
                    res.image=n1.image+n2.image;
                    //return result
                    return res;

                }
                public static void main(String[] args) {
                    //crreating the two ccomplex number
                    ComplexNumber c1=new ComplexNumber(4,5);
                    ComplexNumber c2=new ComplexNumber(10,5);
                    System.out.println("First complex number:");
                    c1.showC();
                    System.out.println("Second complex number:");
                    c2.showC();
                    //calling to add the perform function
                    ComplexNumber res=add(c1,c2);
                    //display addition
                    System.out.println("\n the addition   is:");
                    res.showC();
                }
            
    }

