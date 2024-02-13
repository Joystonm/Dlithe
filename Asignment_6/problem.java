package Asignment_6;

public class problem {

    public static void main(String[] args) {
        int nums[]=new int[]{1,2,1};
        int n=nums.length;
        int ans[]=new int[2*n];
    
        for(int i=0;i<n;i++){
            ans[i]= nums[i];
            ans[i + n]=nums[i];
        }
        for(int i=0;i<2*n;i++){
            System.out.println(ans[i]);
        }
    
    }
}
