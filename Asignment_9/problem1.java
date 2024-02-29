
package Asignment_9;

public class problem1 {
    static int[] leader(int a[], int n) {
        int res[] = new int[n];
        int count = 0;
        int max = a[n - 1];

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] >= max) {
                max = a[i];
                res[count++] = a[i];
            }
        }

        int[] leaders = new int[count];
        for (int i = 0; i < count; i++) {
            leaders[i] = res[i];
        }
        reverse(leaders, 0, leaders.length - 1);
        return leaders;
    }

    static void reverse(int a[], int i, int j) {
        while (i <= j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        // int n = 6;
        // int a[] = { 16, 17, 4, 3, 5, 2 };
        int n = 5;
        int a[] = { 1, 2, 3, 4, 0 };

        int result[] = leader(a, n);
        for (int x : result) {
            System.out.println(x);
        }
    }
}
