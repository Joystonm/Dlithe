package Asignment_5;

import java.util.Scanner;

public class problem3 {
    static void BinaryNum(int n){
        String binary=Integer.toBinaryString(n);
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BinaryNum(n);
    }
}
