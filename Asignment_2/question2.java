import java.util.Scanner;

public class question2 {
    static int a,b,c;

    public static int noTeenSum(){
       return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }
    public static int fixTeen(int n){
        if(n>=13 && n<=14 || n>=15 && n<=19)
            return 0;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(noTeenSum());
    }
}
