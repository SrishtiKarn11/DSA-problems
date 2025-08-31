public class Single_Number {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int XORR=0;
        for(int i=0;i<n;i++){
          XORR=XORR^nums[i];
          }
          return XORR;
    }

    public static void main(String args[]){
        Single_Number obj = new Single_Number();
        int arr[] = {4,1,2,1,2};
        System.out.println(obj.singleNumber(arr));
        
    }
}

