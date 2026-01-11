import java.util.*;
class Main{
 
    private static void MoveZeroEnd(int[] arr) {
        int ptzero=0;
        int ptnonZero=1;
        for(int i=0;i<arr.length;i++){
            while (ptnonZero<arr.length) {
             if(arr[ptzero]==0 && arr[ptnonZero]!=0){
                int temp=arr[ptzero];
                arr[ptzero]=arr[ptnonZero];
                arr[ptnonZero]=temp;
                ptnonZero++;
                ptzero++;
                break;
            }
            if(arr[ptzero]==0 && arr[ptnonZero]==0){
                ptnonZero++;
                break;
            }
            if(arr[ptzero]!=0 && arr[ptnonZero]==0){
                ptzero++;
                ptnonZero++;
                break;
            }
            if(arr[ptzero]!=0 && arr[ptnonZero]!=0){
                ptzero++;
                ptnonZero++;
                break;
            }   
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String [] args){
      int arr[]={1,0,0,0,0,0};
      MoveZeroEnd(arr);

    }

   

}
