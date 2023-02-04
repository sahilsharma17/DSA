import java.util.Arrays;

public class MinMaxSelectionSort {
    public static void main(String[] args) {
        int[] a = new int[]{ 5,7,6,2,1 }; 
        System.out.println("Unsorted Array - ");
        System.out.println(Arrays.toString(a));
        int i,j,min,max,minIndex,maxIndex,tmp;
        int n = a.length;
        for (i=0,j=n-1; i<j; i++,j--){
            min=max=a[i];
            minIndex=maxIndex=i;
            for (int k=i; k<=j; k++){
                if (a[k]<max){
                    max = a[k];
                    maxIndex = k;
                }else if(a[k] > min){
                    min = a[k];
                    minIndex = k;
                }
            }
            tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
            if (a[minIndex] == max){
                tmp = a[j];
                a[j] = a[minIndex];
                a[minIndex] = tmp;
            }else {
                tmp = a[j];
                a[j] = a[maxIndex];
                a[maxIndex] = tmp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
