// water trap quesation
import java.util.*;
public class solution4 {
    public static int trap(int height[]){
        int n = height.length;

        int res = 0, left = 0, right = n-1;
        int rightMax = height[right], leftMax = height[left];

        while (left<right) {
            if(leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                res += rightMax - height[right];

            }
        }
          return res;
    }
    public static void main(String args[]){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
