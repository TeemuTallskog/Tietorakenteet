package Suunnittelumallit.AbstractFactory;

public class Jasper {

    public void pue(AbstractFactory ab){
        Farkut farkut = ab.getJeans();
        Kengat kengat = ab.getShoes();
        Lippis lippis = ab.getHat();
        Tpaita tpaita = ab.getShirt();

        System.out.print("Jasper pukee: ");
        farkut.pue();
        System.out.print(", ");
        kengat.pue();
        System.out.print(", ");
        lippis.pue();
        System.out.print(", ");
        tpaita.pue();
        System.out.print("\n");
    }

}
