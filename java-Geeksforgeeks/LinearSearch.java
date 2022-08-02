public class LinearSearch {
    static int search(int arr[],int n,int M){
        for(int i=0;i<n;i++){
            if(arr[i]==M)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={5,1,1,9,7,2,6};
        int n=arr.length;
        int M=7;
        int index=search(arr,n,M);
        if(index==-1){
            System.out.println("Element not present in the list");
        }
        else{
            System.out.println("Element Are present in the list" +index);
        }

    }
}
