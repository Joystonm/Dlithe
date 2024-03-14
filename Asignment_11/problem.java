package Asignment_11;

public class problem {

    static int findCelebrity(int[][] M, int N) {
        int candidate = 0;

        for (int i = 1; i < N; i++) {
            if (knows(M, candidate, i))
                candidate = i;
        }

        for (int i = 0; i < N; i++) {
            if (i != candidate && (knows(M, candidate, i) || !knows(M, i, candidate)))
                return -1;
        }

        return candidate;
    }

    static boolean knows(int[][] M, int i, int j) {
        return M[i][j] == 1;
    }

    public static void main(String[] args) {
        int N1 = 3;
        int[][] M1 = { { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 } };
        System.out.println(findCelebrity(M1, N1));

        int N2 = 2;
        int[][] M2 = { { 0, 1 },
                { 1, 0 } };
        System.out.println(findCelebrity(M2, N2));
    }
}
