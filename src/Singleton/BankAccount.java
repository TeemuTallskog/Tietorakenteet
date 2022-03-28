package Singleton;

public class BankAccount {

    private static BankAccount instance = null;
    private int funds = 0;

    private BankAccount(){
    }

    public static synchronized BankAccount getInstance(){
        if(instance == null){
            instance = new BankAccount();
        }
        return instance;
    }

    public synchronized void deposit(int sum){
        System.out.println(sum + "€ was deposited");
        funds += sum;
    }

    public synchronized int withdraw(int sum){
        System.out.println("Attempting to withdraw " + sum + "€");
        if(funds<sum){
            System.out.println("Not enough funds");
            System.out.println("Current account balance: " + funds + "€");
            return 0;
        }
        else {
            System.out.println("Withdrew: " + sum + "€");
            funds -= sum;
            System.out.println("Current account balance: " + funds + "€");
            return sum;
        }
    }
}
