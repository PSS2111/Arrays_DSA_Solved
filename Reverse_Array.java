import java.util.*;
public class Reverse_Array {
private static int[] reverseArray(int[] arr, int n) {
        int i=0;
        while (i<=n) {
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1};
        System.out.println("UnReversed Array");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int n=arr.length-1;
        int arrnew[]=reverseArray(arr,n);
        System.out.println("Reversed Array--");
        for (int i : arrnew) {
            System.out.print(i+" ");
        }
    }

    
    
}