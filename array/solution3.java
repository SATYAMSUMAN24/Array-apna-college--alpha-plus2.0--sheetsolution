// buy and sell stock profit
import java.util.*;
public class solution3 {
    public static int profit(int prices[]){
        int buy = prices[0];
        int profit = 0;

        for(int i=1; i<prices.length; i++) {
            if(buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            }
            else {
                buy = prices[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        // int prices[] = {7,6,4,3,1};
        System.out.println(profit(prices));
    }
}