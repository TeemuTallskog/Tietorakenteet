package Suunnittelumallit.Builder;

import Suunnittelumallit.Builder.Product.BigMac;
import Suunnittelumallit.Builder.Product.DoubleBurger;

public class Customer {
    public static void main(String[] args){
        Employee employee = new Employee();

        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();
        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();

        employee.setBurgerBuilder(mcDonaldsBuilder);
        employee.constructBurger();
        employee.setBurgerBuilder(hesburgerBuilder);
        employee.constructBurger();

        BigMac bigMac = mcDonaldsBuilder.getBurger();
        DoubleBurger doubleBurger = hesburgerBuilder.getBurger();

        System.out.println(bigMac);
        System.out.println(doubleBurger);
    }
}
