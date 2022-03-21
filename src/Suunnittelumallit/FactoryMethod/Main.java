package Suunnittelumallit.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus oppilas = new Oppilas();
        AterioivaOtus juoppo = new Juoppo();
        opettaja.aterioi();
        oppilas.aterioi();
        juoppo.aterioi();
    }
}
