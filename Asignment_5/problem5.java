package Asignment_5;

import java.util.Scanner;

public class problem5 {
    static int prime(int n){
        int i=n;
        int small=i-1;
        int lar=i+1;
        while(!NearestPrime(small) && !NearestPrime(small)){
            small--;
            lar++;
        }
        return NearestPrime(small)?small:lar;
    }
    static boolean NearestPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(  prime(n));
        
    }
}
