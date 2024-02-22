package Asignment_8;
import java.util.*;
public class problem1 {
    static void findTwoElement(int arr[], int n) {
       
        Arrays.sort(arr);
        int count=0;
        int res[]=new int[2];
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                res[count++]=arr[i];
            }
        }
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i <n; i++) {
            sum += arr[i];
        }
        int result=Math.abs(totalSum-sum);
        res[count] = Math.abs(result-res[0]); // Missing number

        

        // Output the result
        for (int x : res) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int Arr[] = {2, 2};
        // int Arr[] = {1, 3, 3};

        findTwoElement(Arr, n);
    }
}
