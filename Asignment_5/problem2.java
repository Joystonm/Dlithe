package Asignment_5;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int rev=0;
      boolean negative=false;
      if(n<0){
       negative=true;
        n=Math.abs(n);
      }
      while(n>0){
        int rem=n%10;
        rev=rev*10+rem;
        n=n/10;
      }
      if(negative==true){
        rev=-rev;
      }
      System.out.println(rev);
    }
}
