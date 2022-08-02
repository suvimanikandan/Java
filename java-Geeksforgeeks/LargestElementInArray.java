public class LargestElementInArray {
    static int arr[]={10,34,45,90,56};
     static int largest()
     {
        
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        if(arr[i]>max)
        max=arr[i];

        return max;
     }
     public static void main(String[] args) {
        System.out.println("largest in the given array"+largest());
     }
    
}
