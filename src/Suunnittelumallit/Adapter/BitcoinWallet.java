package Suunnittelumallit.Adapter;

public class BitcoinWallet {
    private double balance;

    public BitcoinWallet(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }
}
