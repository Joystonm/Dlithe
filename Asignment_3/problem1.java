package Asignment_3;
import java.util.*;
public class problem1 {
    static int a,b;

    public static boolean lastdigit(){
        int x= a%10;
        int y=b%10;
        return (x==y)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        
        System.out.println( lastdigit());

    }
}
