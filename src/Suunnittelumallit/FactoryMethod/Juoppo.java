package Suunnittelumallit.FactoryMethod;

public class Juoppo extends AterioivaOtus{
    @Override
    public Juoma createJuoma() {
        return new Olut();
    }
}
