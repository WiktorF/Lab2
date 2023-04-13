package Iterators;

import Interfaces.Iterator;

public class ArrayIterator implements Iterator {

    final Object[] tab;
    final int first;
    final int last;
    int current;
    public ArrayIterator(Object[] Tab, int startidx, int amount){
        current = -1;
        tab = Tab;
        first = startidx;
        last = first + amount - 1;
    }
    public ArrayIterator(Object[] Tab){
        tab = Tab;
        first = 0;
        last = tab.length - 1;
    }

    @Override
    public void first() {
        current = first;
    }

    @Override
    public void last() {
        current = last;
    }

    @Override
    public void next() {
        current++;
    }

    @Override
    public void previous() {
        current--;
    }

    @Override
    public boolean isDone() {
        return current < first || current > last;
    }

    @Override
    public Object current() {
        return tab[current];
    }
}
