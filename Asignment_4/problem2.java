package Asignment_4;
import java.util.*;
public class problem2 {
    static Scanner sc=new Scanner(System.in);

    public static int deposit(int balance){
        System.out.println("enter the money");
        int money=sc.nextInt();
        balance+=money;
        return balance;
    }

    public static int withdraw(int balance){
        System.out.println("enter the money to withdraw");
        int money=sc.nextInt();
        if(money<=balance){
            balance-=money;
            System.out.println("withdrawed succesfully :"+Math.abs(money));
        }else{
            System.out.println("insufficient balance");
        }
            return balance;
    }

    public static int enquiry(int balance){
        System.out.println("total amount"+balance);
        return balance;
        }
    public static void main(String[] args) {
       
        int pin=1234;
        int balance=0;
        System.out.println("enter the pin");
        int ipin=sc.nextInt();
        if(ipin==pin){
            
            do{
                System.out.println("1.deposit\n2.withdraw\n3.balance enquiry\n4.pin change\n5.exit");
                System.out.println("enter option");
                int ch=sc.nextInt();
                switch(ch){
                    case 1:balance=deposit(balance);
                    System.out.println("deposited succesfully :"+balance);
                    break;
                    case 2:balance=withdraw(balance);
                    break;
                    case 3:enquiry(balance);
                    break;
                    case 4:System.out.println("enter the pin");
                           int apin=sc.nextInt();
                           if(apin==pin){
                                System.out.println("enter new pin");
                                int npin=sc.nextInt();
                                System.out.println("pin changed succesfully");
                           }
                           break;
                    default:System.out.println("invalid option");
                }
            }while(true);
        }else{
            System.out.println("invalid pin");
        }
        
    }
}
