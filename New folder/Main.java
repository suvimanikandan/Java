import java.io.*;
import java.util.*;
public class Main{
public static class MaxStack {
   public  MaxStack(){

   }
   public void push(int x){

}
public int pop(){
    return 0;
}
public int top(){
    return 0;

}
public int peekMax(){
    return 0;
}
public int popMax(){
    return 0;
}
}


public static void main(String[]args) 
throws Exception{
BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
MaxStack maxst=new MaxStack();

while(read.ready()){
    String[]inp=read.readLine().split(" ");
    switch(inp[0]){
        case"pop":
    System.out.println(maxst.pop());
    break;
      case"top:":
      System.out.println(maxst.top());
      break;
      case"popMax":
      System.out.println(maxst.popMax());
      break;
      case"peekMax":
      System.out.println(maxst.peekMax());
      break;
      case"push":
      maxst.push(Integer.parseInt(inp[1]));;
      break;
    }
}
}
}