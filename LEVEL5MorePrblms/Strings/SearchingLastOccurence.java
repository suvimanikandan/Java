package Strings;

public class SearchingLastOccurence {
    public static void main(String[] args) {
        String word="Hello World,hello Reader";
        int lastIndex=word.lastIndexOf("hello");

        if(lastIndex==-1){
            System.out.println("Hello not found");
        }
        else{
            System.out.println("Lastt occurence of the hello index is"+lastIndex);
        }
    }
}
