/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author kamaj
 */
interface Iterator {
    boolean hasNext();
    Object next();
}

public class StackIterator implements Iterator {
    private int  current;
    private Stack container; // container on tietorakenne, jota iteroidaan

    StackIterator (Stack c) { // konstruktori on "package visible"
        container = c;
        current = container.top;
    }
    // palautetaan tieto siitä, löytyyko rakenteesta seuraava alkio
    // hmm... palautetaan tieto siitä, osoittaako nykypositio (current) alkiota vai ei.
    public boolean hasNext() {
        if(container.taulu[current+1] == null){
            return false;
        }else return true;
    }
    // palautetaan nykyinen (lista-alkio) ja siirretään nykypositiota pykälä eteenpäin
    public String next() {
        String old;
        if(hasNext()){
            old = container.taulu[current];
            current += 1;
        }else{
            old = container.taulu[current];
        }
        return old;
    }

}

