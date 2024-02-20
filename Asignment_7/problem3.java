package Asignment_7;
import java.util.*;
public class problem3 {
    static int majorityElement(int a[]){
        int cur=a[0];
        int count=1;
        Arrays.sort(a);
        for(int i=1;i<a.length;i++){
            if(cur==a[i]){
                count++;
            }else{
                cur=a[i];
                count=1;
            }
        }
        if(count>a.length/2){
            return cur;
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3;
        int a[]=new int []{1,2,3} ;
        int a1[]=new int[]{3,1,3,3,2} ;

     
    System.out.println(majorityElement(a));
    System.out.println(majorityElement(a1));
    }

    }
