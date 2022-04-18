package Suunnittelumallit.Builder.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigMac {

    private final List<Object> ingredientList = new ArrayList<Object>();

    public void addIngredient(Object ingredient){
        ingredientList.add(ingredient);
    }

    @Override
    public String toString(){
        return Arrays.toString(new List[]{ingredientList});
    }
}
