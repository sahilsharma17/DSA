import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{ 5,7,6,2,1 }; 
        System.out.println("Unsorted Array - ");
        System.out.println(Arrays.toString(a));
        int n = a.length;
        for (int i=0; i<=(n-1); i++){
            int min = i;
            for (int j=i+1; j<=(n-1); j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
        System.out.println("Array after Selectin Sort - ");
        System.out.println(Arrays.toString(a));
    }
}
