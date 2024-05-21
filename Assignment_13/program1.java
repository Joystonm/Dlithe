package Assignment_13;

public class program1 {

    static int roman(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i+1<s.length() && romanvalue(ch) < romanvalue(s.charAt(i+1))){
                sum-=romanvalue(ch);
            }else{
                sum+=romanvalue(ch);
            }
        }
        return sum;
    }
    static int romanvalue(char ch){
        int value=0;
            if(ch=='I')
                value= 1;
            else if(ch=='V')
                value= 5;
            else if(ch=='X')
                value= 10;
            else if(ch=='L')
                value= 50;
            else if(ch=='C')
                value= 500;
            else if(ch=='M')
                value= 1000;
        return value;
    }
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(roman(s));
        }
}
