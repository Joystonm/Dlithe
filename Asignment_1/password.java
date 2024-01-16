package Asignment_1;
import java.util.*;

public class password {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = passwordChecker(str);
        System.out.println(result);
    }

    public static int passwordChecker(String password) {
        if (password.length() < 8) {
            return 0;
        }

        boolean upper = false, num = false, lower = false, specialChar = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                lower = true;
            } else if (ch >= '0' && ch <= '9') {
                num = true;
            } else if (isSpecialCharacter(ch)) {
                specialChar = true;
            }
        }

        if (!(upper && num && lower && specialChar)) {
            return 0;
        }

        if (password.contains(" ")) {
            return 0;
        }

        return 1;
    }

    public static boolean isSpecialCharacter(char ch) {
        String specialChars = "!@#$%^&*()";
        return specialChars.contains(String.valueOf(ch));
    }
}
