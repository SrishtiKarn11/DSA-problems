public class Maximum_SubArray {
    public int maxSubArray(int[] nums) {
       int sum=0;
       int maxi=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum>maxi){
            maxi=sum;
            }
            if(sum<0){
                sum=0;
                }
                }
                    return maxi;
        }
        
        public static void main(String args[]){
            Maximum_SubArray obj = new Maximum_SubArray();
            int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
            System.out.println(obj.maxSubArray(arr));
        }
    }
  
