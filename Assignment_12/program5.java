package Assignment_12;

class user{
String name;
int custId,accountNo;
float balance;
user(String name, int accountNo) {
    this.name = name;
    this.custId=2001;
    this.accountNo = accountNo;
    this.balance = 0; 
}

user(String name, int accountNo, float initialBalance) {
    this.name = name;
    this.custId=2006;
    this.accountNo = accountNo;
    this.balance = initialBalance; 
}
void display(){
    System.out.println("name :"+name);
    System.out.println("balance :"+balance);
    System.out.println("customerId :"+custId);
    System.out.println("accountNo :"+accountNo);
}

void deposit(double amount){
    balance+=amount;
    System.out.println("deposit :"+balance);
}

void withdraw(double amount){
    if(balance>=amount){
        balance-=amount;
        System.out.println("withdrawal :"+balance);
    }else 
    System.out.println("insufficient amount");
}
}
public class program5 {
    public static void main(String[] args) {
        user user1 = new user("AB", 1001);
        user user2 = new user("CD", 1002, 5000);

        System.out.println("user1");
        user1.deposit(500);
        user1.display();

        
        System.out.println("\nuser2");
        user2.withdraw(2000);
        user2.display();
    }
}
