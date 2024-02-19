package Asignment_7;

public class problem2 {
    static int MissingNumber(int arr[],int n){
        int num=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        return num-sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[] { 1, 2, 3, 5 };

       

        System.out.println(  MissingNumber(arr, n) );


    }
}
