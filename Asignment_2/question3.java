import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && b == c)
            System.out.println(20);
        else if (a == b || b == c)
            System.out.println(10);
        else
            System.out.println(0);

    }
}
