package Assignment_12;

public class program4 {

    static int[] arrange(int n[]){
        int a[]=new int[n.length];
        int b[]=new int[n.length];
        int res[]=new int[n.length];
        int c1=0,c2=0,count=0;
        for(int i=0;i<n.length;i++){
            if(prime(n[i])==true){
                a[c1++]=n[i];
            }else{
                b[c2++]=n[i];
            }
        }
        for(int i=0;i<c1;i++){
            res[count++]=a[i];
        }

        for(int i=0;i<c2;i++){
            res[count++]=b[i];
        }
        return res;
    }

    static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6};
        int res[]=arrange(n);

        for(int r:res){
            System.out.println(r);
        }
    }
}
