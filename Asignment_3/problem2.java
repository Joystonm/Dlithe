package Asignment_3;

import java.util.Scanner;

public class problem2 {

    public static boolean even(int n){
   return (n%2==0)?true:false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( even(n));
    }
}
