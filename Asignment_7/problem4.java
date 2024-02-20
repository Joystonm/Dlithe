package Asignment_7;

import java.util.HashSet;

public class problem4 {
    static int doUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> unionSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            unionSet.add(b[i]);
        }

        return unionSet.size();
    }

    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3 };

        System.out.println(doUnion(a, n, b, m)); // Output: 5

        n = 6;
        m = 2;
        int[] c = { 85, 25, 1, 32, 54, 6 };
        int[] d = { 85, 2 };

        System.out.println(doUnion(c, n, d, m)); // Output: 7
    }
}
