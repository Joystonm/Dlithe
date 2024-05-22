package Assignment_12;
import java.util.*;
public class program3 {

  public static void findMajorityElement(int[] arr) {
   
    int candidate1 = Integer.MIN_VALUE, candidate2 = Integer.MIN_VALUE;
    int count1 = 0, count2 = 0;

    for (int num : arr) {
        if (num == candidate1) {
            count1++;
        } else if (num == candidate2) {
            count2++;
        } else if (count1 == 0) {
            candidate1 = num;
            count1 = 1;
        } else if (count2 == 0) {
            candidate2 = num;
            count2 = 1;
        } else {
            count1--;
            count2--;
        }
    }

    count1 = 0;
    count2 = 0;

    for (int num : arr) {
        if (num == candidate1) {
            count1++;
        } else if (num == candidate2) {
            count2++;
        }
    }

    if (count1 > arr.length / 3) {
        System.out.print("\n"+candidate1);
    }
    if (count2 > arr.length / 3) {
        System.out.print("\n"+candidate2);
    }
    
    System.out.println();
}

    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3,1,1};
        findMajorityElement(nums);
    }
  }
