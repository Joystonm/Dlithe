package Assignment_12;

public class program2 {

    static int prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

    static int sum(int n){
       int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=23;
        if(prime(n)==1){
           int nw=sum(n);
           if(prime(nw)==1)
                System.out.println("1");
            else 
                System.out.println("0");
        }    
    }
}
