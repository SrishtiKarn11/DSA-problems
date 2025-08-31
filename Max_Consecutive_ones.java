public class Max_Consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int maxNum = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxNum = Math.max(maxNum, count);
        }
        return maxNum;
    }
    public static void main(String args[]){
        Max_Consecutive_ones obj = new Max_Consecutive_ones();
        int arr[] = {1,1,0,1,1,1};
        System.out.println(obj.findMaxConsecutiveOnes(arr));
        
    }
}
  
