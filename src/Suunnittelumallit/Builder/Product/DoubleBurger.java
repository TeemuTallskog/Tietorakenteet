package Suunnittelumallit.Builder.Product;

import Suunnittelumallit.Builder.Ingredients.Beef;
import Suunnittelumallit.Builder.Ingredients.Bun;
import Suunnittelumallit.Builder.Ingredients.Salad;
import Suunnittelumallit.Builder.Ingredients.Sauce;

public class DoubleBurger {

    private final StringBuilder burgerString = new StringBuilder();

    public void addBun(Bun bun){
        burgerString.append(", ").append(bun.toString());
    }
    public void addSalad(Salad salad){
        burgerString.append(", ").append(salad.toString());
    }
    public void addSauce(Sauce sauce){
        burgerString.append(", ").append(sauce.toString());
    }
    public void addBeef(Beef beef){
        burgerString.append(", ").append(beef.toString());
    }

    @Override
    public String toString(){
        return burgerString.toString();
    }

}
