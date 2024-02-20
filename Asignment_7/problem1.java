package Asignment_7;

public class problem1 {
    static void sort012(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = new int[] { 0, 2, 1, 2, 0 };
        int arr1[] = new int[] { 0, 1, 0 };

        sort012(arr);
        sort012(arr1);
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int x : arr1) {
            System.out.print(x + " ");
        }
    }
}
