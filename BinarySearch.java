

public class BinarySearch {
    static void BinarySearch(int a[],int l, int r, int x){
        int mid = (l+r)/2;
        if (r>=l){
            if (x == a[mid]){
                System.out.println("Item found at index "+mid );
            }else if(x > a[mid]){
                BinarySearch(a, mid+1, r, x);
            }else if(x < a[mid]){
                BinarySearch(a, l, mid-1, x);
            }else{
                System.out.println("Item you are searching for is not in the array.");
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,3,5,9,12};
        int r = arr.length-1;
        int l = 0;
        BinarySearch(arr,l,r,4);
    }
}
