import java.util.HashSet;

public class Contains_Duplicates {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>seen=new HashSet<>();
        HashSet<Integer>duplicates=new HashSet<>();
        for(int num:nums){
            if(!seen.add(num)){
                duplicates.add(num);
                return true;
            }
            
        }
        return false;
    }
    public static void main(String args[]){
        Contains_Duplicates obj = new Contains_Duplicates();
        int arr[] = {1,2,3,1};
        System.out.println(obj.containsDuplicate(arr));
        
    }
}
