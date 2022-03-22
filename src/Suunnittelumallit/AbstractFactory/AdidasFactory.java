package Suunnittelumallit.AbstractFactory;

public class AdidasFactory extends AbstractFactory{
    @Override
    Kengat getShoes() {
        return new AdidasKengat();
    }

    @Override
    Farkut getJeans() {
        return new AdidasFarkut();
    }

    @Override
    Lippis getHat() {
        return new AdidasLippis();
    }

    @Override
    Tpaita getShirt() {
        return new AdidasTpaita();
    }
}
