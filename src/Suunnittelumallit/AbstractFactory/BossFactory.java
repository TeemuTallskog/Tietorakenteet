package Suunnittelumallit.AbstractFactory;

public class BossFactory extends AbstractFactory{
    @Override
    Kengat getShoes() {
        return new BossKengat();
    }

    @Override
    Farkut getJeans() {
        return new BossFarkut();
    }

    @Override
    Lippis getHat() {
        return new BossLippis();
    }

    @Override
    Tpaita getShirt() {
        return new BossTpaita();
    }
}
