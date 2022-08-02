public class BinarySearch {
    int binarySearch(int arr[],int l,int r, int x){
        if(r>=1){
            int mid=1+(r-l)/2;
//element at middle
            if(arr[mid]==x)
            return mid;
            //left sub array
            if(arr[mid]>x)
            return binarySearch(arr, l, mid-1, x);
            //else should be present in the right sub array
            return binarySearch(arr, mid+1, r, x);
        }
        //not element in present in array
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch ob=new BinarySearch();
        int arr[]={2,3,4,10,40};
        int n=arr.length;
        int x=10;
        int result=ob.binarySearch(arr, 0, n-1, x);
        if(result==-1)
        System.out.println("Element not foundd in the list");
        else
        System.out.println("Element found at index"+result);
    }
}
