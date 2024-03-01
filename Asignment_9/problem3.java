package Asignment_9;

public class problem3 {
    static char nonrepeat(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=s.indexOf(ch,i+1);
            if(index==-1){
                res+=ch;
            }
        }
        char f=res.charAt(0);
        return f;
     
    }
    public static void main(String[] args) {
        String s = "hello";
        // String s="zxvczbtxyzvy";
        System.out.println( nonrepeat(s));
    }
}
