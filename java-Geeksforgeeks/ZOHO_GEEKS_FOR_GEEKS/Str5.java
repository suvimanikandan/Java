package ZOHO_GEEKS_FOR_GEEKS;
//sort a string
public class Str5 {
    public static void main(String[] args) {
        String str="swetha";
        char arr[]=str.toCharArray();
    char temp;
    int i=0;
    while(i<arr.length){
        int j=i+1;
        while(j<arr.length){
            if(arr[j]<arr[i]){
                //comparing the characters one by one
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
        }
        j+=1;
}
i+=1;
    }
    System.out.println(arr);

    }
}
