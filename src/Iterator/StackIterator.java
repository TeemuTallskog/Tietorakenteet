/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;
import java.util.List;

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
    private Stack container;

    StackIterator (Stack c) {
        container = c;
        current = 0;
    }
    @Override
    public boolean hasNext() {
        return container.taulu[current] != null;
    }
    @Override
    public String next() {
        return container.taulu[current++];
    }

}

