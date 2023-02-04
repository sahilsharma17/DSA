import java.util.Arrays;

/*Bubble Sort is the simplest sorting algorithm that works by repeatedly
swapping the adjacent elements if they are in the wrong order. 
This algorithm is not suitable for large data sets as its average and
worst-case time complexity is quite high. */
public class BubbleSort{
    public static void main(String[] args) {
        int[] a = new int[]{ 5,4,3,2,1 }; 
        System.out.println("Unsorted Array - ");
        System.out.println(Arrays.toString(a));
        for (int i=0;i<=a.length-2;i++){
            for (int j=0;j<=(a.length-2-i);j++){
                if (a[j] > a[j+1]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }
            }
        }
        System.out.println("Array after Bubble Sort - ");
        System.out.println(Arrays.toString(a));
    }
}