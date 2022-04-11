package Suunnittelumallit.Memento;

import java.util.HashMap;

public class Guesser {

    private class Memento{
        private int random;

        public Memento(){
            this.random = (int) (Math.random() * 20);
        }
    }


    public Object joinGame(){
        return new Memento();
    }

    public boolean guess(Object memento, int guess){
        if(memento.getClass() != Memento.class) return false;
        Memento mem = (Memento) memento;
        if(mem.random == guess){
            return true;
        }else return false;
    }
}