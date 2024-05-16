package Assignment_12;

class user{
String name;
int balance,custId,accountNo;

void display(){
    System.out.println("name :"+name);
    System.out.println("balance :"+balance);
    System.out.println("customerId :"+custId);
    System.out.println("accountNo :"+accountNo);
}

void deposit(double amount){
    balance+=amount;
    System.out.println("balance :"+balance);
}

void withdraw(double amount){
    if(balance>=amount){
        balance-=amount;
        System.out.println("balance :"+balance);
    }else 
    System.out.println("insufficient amount");
}
}
public class program5 {
    public static void main(String[] args) {
        
    }
}
