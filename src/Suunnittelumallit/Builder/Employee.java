package Suunnittelumallit.Builder;

public class Employee {
    private IHamburgerBuilder burgerBuilder;

    public void setBurgerBuilder(IHamburgerBuilder bb){
        this.burgerBuilder = bb;
    }

    public void constructBurger(){
        burgerBuilder.createBurger();
        burgerBuilder.buildBuns();
        burgerBuilder.buildBeef();
        burgerBuilder.buildSalad();
        burgerBuilder.buildSauce();
    }
}
