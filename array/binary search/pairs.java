// wep to pairs in an array
import java.util.*;
public class pairs {
    public static void printpairs(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i]; // 2 , 4 ,6 , 8,10
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("(" + curr + " , " + numbers[j] +")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12};
        printpairs(number);
    }
}
