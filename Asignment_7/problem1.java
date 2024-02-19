package Asignment_7;

public class problem1 {
    static void sort012(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[] { 0, 2, 1, 2, 0 };
        int arr1[] = new int[] { 0, 1, 0 };

        sort012(arr);
        sort012(arr1);
        for (int x : arr) {
            System.out.print(x);
        }
        System.out.println();
        for (int x : arr1) {
            System.out.print(x);
        }

    }
}
