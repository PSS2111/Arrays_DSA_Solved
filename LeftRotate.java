import java.util.*;
class Main{

 private static void RotateArr(int[] arr) {
       int firstEle=arr[0];
       for(int i=1;i<arr.length;i++){
        arr[i-1]=arr[i];
        if(i==arr.length-1){
            arr[arr.length-1]=firstEle;
        }
       }
       System.out.print("[");
       for (int i : arr) {
        System.out.print(i+" ");
       }
       System.out.print("]");

    }
    public static void main(String [] args){
      int arr[]={1,2,3,4,5,6};
      RotateArr(arr);

    }

}
