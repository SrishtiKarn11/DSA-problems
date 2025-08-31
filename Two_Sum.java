import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int compliment=target-nums[i];
            if(map.containsKey(compliment)&&map.get(compliment)!=i){
                return new int[]{i,map.get(compliment)};
            }
        }

    
        return new int[]{};
        
    }
    public static void main(String args[]){
        Two_Sum obj = new Two_Sum();
        int arr[] = {2,7,11,15};
        int target=9;
        int result[]=obj.twoSum(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        
    }
}

