package Suunnittelumallit.Memento;

public class Main {
    public static void main(String[] args){
        Guesser guesser = new Guesser();
        Client c1 = new Client(guesser, "1");
        Client c2 = new Client(guesser, "2");
        Client c3 = new Client(guesser, "3");
        Client c4 = new Client(guesser, "4");
        Client c5 = new Client(guesser, "5");
        Client c6 = new Client(guesser, "6");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
    }
}
