package Asignment_6;

public class problem2 {
    public static int operation(int nums[]){
        int minindex=min(nums);
        int operation=0;
        int n=nums.length;
        int temp=0;
        while(n>0){
            if(minindex==0){
                n--;
                operation++;
                if (n > 0) {
                    for(int i = 0; i < n; i++) {
                        nums[i] = nums[i + 1];
                    }
                    minindex = min(nums);
                }
            } else {
                temp=nums[0];
                for(int i=0;i<n-1;i++){
                    nums[i]=nums[i+1];
                }
                nums[n-1]=temp;
                minindex = min(nums);
                operation++;
            }
        }
        return operation;
    }

    public static int min(int nums[]){
        int min = nums[0];
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        int nums[]=new int[]{3,4,-1};
        System.out.println(operation(nums));
    }
}
