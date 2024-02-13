package Asignment_6;

public class problem4 {
        public boolean splitArraySameAverage(int[] nums) {
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            int n = nums.length;
    
            boolean[][] dp = new boolean[n / 2 + 1][sum + 1];
            dp[0][0] = true; 
    
            for (int num : nums) {
                for (int i = n / 2; i >= 1; i--) {
                    for (int j = sum; j >= num; j--) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j - num];
                    }
                }
            }
    
            for (int i = 1; i <= n / 2; i++) {
                if (sum * i % n == 0 && dp[i][sum * i / n]) {
                    return true;
                }
            }
    
            return false;
        }
    
        public static void main(String[] args) {
            problem4 solution = new problem4();
    
            int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8};
            int[] nums2 = {3, 1};
    
            System.out.println("Output for nums1: " + solution.splitArraySameAverage(nums1)); 
            System.out.println("Output for nums2: " + solution.splitArraySameAverage(nums2));
        }
    }
    
