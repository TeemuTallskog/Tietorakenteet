package Suunnittelumallit.Builder;

import Suunnittelumallit.Builder.Ingredients.Bun;
import Suunnittelumallit.Builder.Ingredients.Salad;
import Suunnittelumallit.Builder.Product.BigMac;

public class McDonaldsBuilder implements IHamburgerBuilder{

    private BigMac burger;

    @Override
    public void createBurger() {
        this.burger = new BigMac();
    }

    @Override
    public void buildBuns() {
        this.burger.addIngredient(new Bun("3xBuns"));
    }

    @Override
    public void buildBeef() {
        this.burger.addIngredient(new Bun("Burnt beef"));
    }

    @Override
    public void buildSalad() {
        this.burger.addIngredient(new Salad("Pickles"));
    }

    @Override
    public void buildSauce() {
        this.burger.addIngredient(new Salad("McDonald's sauce"));
    }

    @Override
    public BigMac getBurger() {
        return this.burger;
    }
}
