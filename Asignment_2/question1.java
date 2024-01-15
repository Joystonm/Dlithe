import java.util.*;
public class question1{
    static int a,b,c;
    public static int sum(){
        if(c==13)
            return a+b;
        else if(b==13)
            return a;
        else return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(sum());



    }
}