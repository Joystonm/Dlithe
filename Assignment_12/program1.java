package Assignment_12;

public class program1 {

    static int countspchar(String str){
        int c=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String str="abc@123#";
        System.out.println(countspchar(str));
        
    }
}
