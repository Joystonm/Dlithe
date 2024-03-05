package Asignment_10;

public class problem1 {
    static void rotateArray(int[] arr, int rotations) {
        int n = arr.length;
        rotations %= n; 

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, rotations - 1);
        reverseArray(arr, rotations, n - 1);
    }
    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int rotations=1;
        rotateArray(arr, rotations);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
