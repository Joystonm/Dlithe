import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String result;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            result.append(ch).append(ch);

        }
    }
}
