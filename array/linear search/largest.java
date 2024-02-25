// find the largest number in a given array
// 1 2 6 3 5
import java.util.*;
public class largest{
    public static int getLargest(int numbers[]) {
       int largest = Integer.MIN_VALUE; // -INFINITY
       int smallest = Integer.MAX_VALUE;

       for(int i=0; i<numbers.length; i++){
        if(largest< numbers[i]){
            largest = numbers[i];
        }
        if(smallest > numbers[i]){
            largest = numbers[i];
        }
       }
       return largest;
    }
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5};
        System.out.println("largest value is :" + getLargest(numbers));
    }
}