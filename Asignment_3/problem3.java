package Asignment_3;

import java.util.Scanner;

public class problem3 {

    static int a,b;

    public static int sum(){
        return (a==b)?2*(a+b):(a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    
        System.out.println(sum());
    }
}
