package Asignment_9;
import java.util.Arrays;

public class problem4 {
    public static void main(String[] args) {

        // Example usage
        int[] nums1 = {2, 8, 5, 4};
        int[] nums2 = {10, 19, 6, 3, 5};

        System.out.println(minSwaps(nums1));
        // System.out.println("Minimum swaps for nums2: " + solution.minSwaps(nums2));
    }

    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int[] sortedNums = Arrays.copyOf(nums, n);
        Arrays.sort(sortedNums);

        int swaps = 0;
        for (int i = 0; i < n; i++) {
            // If the current element is already at the correct position, continue to the next element
            if (nums[i] == sortedNums[i]) {
                continue;
            }

            // Swap the current element with the element at its correct position
            int correctIndex = Arrays.binarySearch(sortedNums, nums[i]);
            int temp = nums[i];
            nums[i] = nums[correctIndex];
            nums[correctIndex] = temp;

            swaps++;
        }

        return swaps;
    }
}
