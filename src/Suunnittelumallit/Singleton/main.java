package Suunnittelumallit.Singleton;

public class main {

    public static void main(String[] args){

        Person dad = new Person(1200, "Dad");
        Person mom = new Person(1500, "Mom");
        Person son = new Person(200, "Son");
        Person daughter = new Person(50, "Daughter");

        dad.depositMoney(1200);
        mom.withdrawMoney(600);
        son.withdrawMoney(600);
        daughter.withdrawMoney(600);
        son.depositMoney(400);
        daughter.withdrawMoney(400);

    }
}
