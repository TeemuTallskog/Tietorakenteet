package Suunnittelumallit.Adapter;

public class EuroWallet implements ICurrency {
    private double balance;
    public EuroWallet(double balance){
        this.balance = balance;
    }

    @Override
    public double getBalance(){
        return balance;
    }
}
