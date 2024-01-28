package Asignment_4;

import java.util.Scanner;

public class problem4 {
    
    public static String stringTimes(String str,int n){
        StringBuilder result=new StringBuilder();

        for(int i=0;i<n;i++){
            result.append(str);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
    
        System.out.println(stringTimes(str,n));
    }
}
