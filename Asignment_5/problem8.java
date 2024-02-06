package Asignment_5;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=n;i<m;i++){
            // System.out.println(n+""+m);
            int n3=n+m;
            n=n3;
            m=n;
            System.out.println(n3);
        }
    }
    
}
