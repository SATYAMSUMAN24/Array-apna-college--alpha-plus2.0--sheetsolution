// array solution 1 hash method
import java.util.*;
public class solution1hashmethod{
    public static boolean containDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) {
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containDuplicate(nums));
    }
}