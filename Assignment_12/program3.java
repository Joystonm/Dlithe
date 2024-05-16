package Assignment_12;
import java.util.*;
public class program3 {

    static int findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // Initialize index of majority element
    
        // loop through each element and count its occurrences
        for (int i = 0; i < n; i++) {
          int count = 0;
          for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j])
              count++;
          }
    
          // update maxCount and index if this element
          // has higher count than the previous ones
          if (count > maxCount) {
            maxCount = count;
            index = i;
          }
        }
    
        // If maxCount is greater than n/2 return the element
        if (maxCount > n / 2)
          return arr[index];
    
        // No majority element found
        return -1;
      }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4};
        System.out.println("Majority element: " +findMajority(nums,nums.length) );
    }
}
