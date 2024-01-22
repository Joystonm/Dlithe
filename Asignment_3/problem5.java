package Asignment_3;

import java.util.Scanner;

public class problem5 {
    static int a,b;

    public static boolean in1020(){
        return (a>=10 && a<=20 || b>=10 && b<=20)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(in1020());
    }
}
