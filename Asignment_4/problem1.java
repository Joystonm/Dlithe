package Asignment_4;

import java.util.Scanner;

public class problem1 {
    static int n;

    public static void pos() {
        int a[] = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            a[i] = n - i - 1; // Populate the array with values 0, 1, 2, ..., n-1
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        pos();
    }
    

}
