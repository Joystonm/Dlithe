package Asignment_3;

import java.util.Scanner;

public class problem4 {

    static int a,b;

    public static boolean sum(){
        return (a==10 || b==10 || (a+b)==10 )?true:false;
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
       
        System.out.println(sum());
    }
}
