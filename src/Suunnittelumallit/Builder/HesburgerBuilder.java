package Suunnittelumallit.Builder;

import Suunnittelumallit.Builder.Ingredients.Beef;
import Suunnittelumallit.Builder.Ingredients.Bun;
import Suunnittelumallit.Builder.Ingredients.Salad;
import Suunnittelumallit.Builder.Ingredients.Sauce;
import Suunnittelumallit.Builder.Product.DoubleBurger;

public class HesburgerBuilder implements IHamburgerBuilder{

    private DoubleBurger burger;

    @Override
    public void createBurger() {
        this.burger = new DoubleBurger();
    }

    @Override
    public void buildBuns() {
        this.burger.addBun(new Bun("3xBuns"));
    }

    @Override
    public void buildBeef() {
        this.burger.addBeef(new Beef());
    }

    @Override
    public void buildSalad() {
        this.burger.addSalad(new Salad("Iceberg lettuce"));
    }

    @Override
    public void buildSauce() {
        this.burger.addSauce(new Sauce("Secret sauce"));
    }

    @Override
    public DoubleBurger getBurger() {
        return this.burger;
    }
}
