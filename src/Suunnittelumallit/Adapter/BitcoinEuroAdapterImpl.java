package Suunnittelumallit.Adapter;

public class BitcoinEuroAdapterImpl implements IBitcoinCurrencyAdapter {
    private BitcoinWallet bitcoinWallet;

    public BitcoinEuroAdapterImpl(BitcoinWallet bitcoinWallet){
        this.bitcoinWallet = bitcoinWallet;
    }

    @Override
    public double getBalance() {
        return bitcoinToEur();
    }

    private double bitcoinToEur(){
        double val = bitcoinWallet.getBalance();
        val *= 38273.10f;
        return val;
    }
}
