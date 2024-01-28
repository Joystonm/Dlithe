package Asignment_4;
import java.util.*;
public class problem3 {

   public static boolean isprime(int n){
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            return false;
        }     
    }
    return true;
   }
   public static boolean prime(int a,int b){
    if(isprime(a) && isprime(b)){
        return isprime(a+b);
    }
    return false;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

     
        System.out.println(    prime(a,b));


    }
}
