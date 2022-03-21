package Suunnittelumallit.FactoryMethod;

public class Oppilas extends AterioivaOtus{
    @Override
    public Juoma createJuoma() {
        return new CocaCola();
    }
}
