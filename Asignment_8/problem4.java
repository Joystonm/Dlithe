package Asignment_8;

public class problem4 {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 6, 7, 9 };
        int[] arr2 = { 1, 4, 8, 10 };
        int k1 = 5;
        System.out.println(kthElement(arr1, arr2, k1));

        int[] arr3 = { 100, 112, 256, 349, 770 };
        int[] arr4 = { 72, 86, 113, 119, 265, 445, 892 };
        int k2 = 7;
        System.out.println(kthElement(arr3, arr4, k2));
    }

    public static int kthElement(int[] arr1, int[] arr2, int k) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (k == 1)
                    return arr1[i];
                i++;
            } else {
                if (k == 1)
                    return arr2[j];
                j++;
            }
            k--;
        }

        while (i < arr1.length) {
            if (k == 1)
                return arr1[i];
            i++;
            k--;
        }

        while (j < arr2.length) {
            if (k == 1)
                return arr2[j];
            j++;
            k--;
        }

        return -1;
    }
}