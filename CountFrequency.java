import java.util.*;
public class CountFrequency {

private static void CountFreq(int[] arr) {
       HashMap<Integer, Integer> hm=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(hm.containsKey(arr[i])){
            hm.put(arr[i],hm.get(arr[i])+1);
        }
        else{
            hm.put(arr[i],1);
        }
       }
       System.out.println(hm);
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,5,5,5,5,6,7};
        CountFreq(arr);
    }
    
}