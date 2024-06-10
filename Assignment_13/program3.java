package Assignment_13;
import java.util.*;
public class program3 {
    static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int sign = 1;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+' || c == '-') {
                result += sign * num;
                num = 0;
                sign = (c == '+') ? 1 : -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        result += sign * num;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate("1 + 1")); 
        System.out.println(calculate(" 2-1 + 2 ")); 
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)")); 
    }
}