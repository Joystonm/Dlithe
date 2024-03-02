package Asignment_9;

public class problem4 {
    static void swap(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        for(int x:nums){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
       int nums[] = {10, 19, 6, 3, 5};
       swap(nums);

    }
}
