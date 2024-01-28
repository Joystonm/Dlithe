package Asignment_4;

import java.util.Scanner;

public class problem1 {
    static int n;

    public static void pos() {
       for(int i=n-1;i>=0;i--){
            System.out.println(i);
       }
    }
    public static void neg(){
        for(int i=n;i<=0;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n==0){
            System.out.println("already Zero");
        }else if(n>0){
            pos();
        }else neg();
    }
    

}
