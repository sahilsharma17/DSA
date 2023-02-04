import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = new int[]{ 5,4,6,2,1 }; 
        System.out.println("Unsorted Array - ");
        System.out.println(Arrays.toString(a));
        int n = a.length;
        for (int i=1;i<=(n-1);i++){
            int j = i;
            while (j>=0 && (a[j-1]<a[j])){
                int tmp = a[j];
                a[j] = a[j-1];
                a[j-1] = tmp;
                j--;
            }
        }
        System.out.println("Array after Insertion Sort - ");
        System.out.println(Arrays.toString(a));
    }
}
