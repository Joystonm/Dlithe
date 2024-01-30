package Asignment_4;

import java.util.Scanner;
public class problem5 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            printSeries(a, b, n);
        }
    }

    private static void printSeries(int a, int b, int n) {
        int result = a;
        for (int j = 0; j < n; j++) {
            result += Math.pow(2, j) * b;
            System.out.print(result+" ");
        }
    }
}

