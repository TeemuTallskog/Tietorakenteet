package Suunnittelumallit.Adapter;

public class Main {
    public static void main(String[] args){
        ICurrency euroWallet = new EuroWallet(280.1f);
        BitcoinWallet bitcoinWallet = new BitcoinWallet(0.3f);
        IBitcoinCurrencyAdapter BitcoinEuroAdapterWallet = new BitcoinEuroAdapterImpl(bitcoinWallet);

        System.out.println(euroWallet.getBalance() + "€ in euro Wallet");
        System.out.println(bitcoinWallet.getBalance() + "BTC in bitcoin Wallet");
        System.out.println(BitcoinEuroAdapterWallet.getBalance() + "€ in bitcoin Wallet");
    }
}
