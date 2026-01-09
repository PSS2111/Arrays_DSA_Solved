import java.util.*;
public class RemoveDuplicate {

private static int RemoveDuplicate(int[] arr, int size) {
    if(arr.length==0) return 0;
        int i=0;
        for(int j=1;j<size;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,5,5,5,5,6,7};
        int size=arr.length;
        int answer=RemoveDuplicate(arr,size);
        System.out.println(answer);
    }

    
}