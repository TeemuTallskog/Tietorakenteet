package Suunnittelumallit.Memento;

import java.util.HashMap;

public class Guesser {

    private static class Memento{
        private final int random;

        private Memento(){
            this.random = (int) (Math.random() * 20);
        }
    }


    public Object joinGame(){
        return new Memento();
    }

    public boolean guess(Object memento, int guess){
        return (((Memento) memento).random == guess);
    }
}
