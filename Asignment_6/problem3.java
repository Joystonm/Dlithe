package Asignment_6;

public class problem3 {
    public static void main(String[] args) {
        int original[] = {1, 2};
        int m = 1, n = 1;
        int[][] result = new int[m][n];
        int index = 0;

        if (m * n != original.length) {
            System.out.println("[]");
            return;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }

     
        System.out.print("[");
        for (int i = 0; i < m; i++) {
            System.out.print("[");
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j]);
                if (j < n - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}
