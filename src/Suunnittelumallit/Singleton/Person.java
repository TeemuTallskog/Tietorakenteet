package Suunnittelumallit.Singleton;

public class Person {
    private int wallet;
    private String name;

    public Person(int sum, String name){
        wallet = sum;
        this.name = name;
    }

    public void depositMoney(int sum){
        if(wallet<sum){
            int temp = wallet;
            wallet = 0;
            System.out.println(name + " is depositing " + temp + "€");
            BankAccount.getInstance().deposit(temp);
        }else{
            wallet -= sum;
            System.out.println(name + " is depositing " + sum + "€");
            BankAccount.getInstance().deposit(sum);
        }
        System.out.println(name + "'s wallet has " + wallet + "€");
    }

    public void withdrawMoney(int sum){
        System.out.println(name + " is attempting to withdraw " + sum + "€");
        int temp = BankAccount.getInstance().withdraw(sum);
        wallet += temp;
        System.out.println(name + " Withdrew " + temp + "€");
        System.out.println(name + "'s wallet has " + wallet + "€");
    }

    public int getWallet(){
        return wallet;
    }
}
