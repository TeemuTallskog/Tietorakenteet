package Suunnittelumallit.Builder;

public interface IHamburgerBuilder {

    public abstract void createBurger();
    public abstract void buildBuns();
    public abstract void buildBeef();
    public abstract void buildSalad();
    public abstract void buildSauce();

    public abstract Object getBurger();
}
