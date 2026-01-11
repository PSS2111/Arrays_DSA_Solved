import java.util.*;
class Main{
 
    public static int[] TwoSum(int[] nums, int target) {

        HashMap <Integer, Integer> hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need= target-nums[i];
            if(hm.containsKey(need)){
                return new int []{hm.get(need),i};
            }
            hm.put(nums[i],i);

        }
        return new int[] {-1,-1};
    }


    public static void main(String [] args){
      int arr[]={1,44,25,68,11,78};
      int target=103;
      int newarr[]=TwoSum(arr,target);
      for (int i : newarr) {
        System.out.print(i+" ");
      }

    }

   

}
