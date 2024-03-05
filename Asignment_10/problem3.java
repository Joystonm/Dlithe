package Asignment_10;

public class problem3 {
    static void findTripletSum(int[] arr, int targetSum) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);

                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array1 = { 12, 3, 4, 1, 6, 9 };
        int sum1 = 24;
        findTripletSum(array1, sum1);
    }
}
