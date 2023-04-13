package Iterators;

import Interfaces.Iterator;
import Interfaces.Predicate;

public class FilteringIterator implements Iterator {
    private final Iterator iterator;
    private final Predicate predicate;

    public FilteringIterator(Iterator i, Predicate p)
    {
        iterator = i;
        predicate = p;
        iterator.first();
    }

    private void filterForward()
    {
        while (!iterator.isDone() && !predicate.accept(iterator.current())) {
            iterator.next();
        }
    }

    private void filterBackwards()
    {
        while( !iterator.isDone() && !predicate.accept(iterator.current())) {
            iterator.previous();
        }
    }

    public void first()
    {
        iterator.first();
        filterForward();
    }

    public void last()
    {
        iterator.last();
        filterBackwards();
    }

    public void next()
    {
        iterator.next();
        filterForward();
    }

    public void previous()
    {
        iterator.previous();
        filterBackwards();
    }

    public boolean isDone()
    {
        return iterator.isDone();
    }

    public Object current()
    {
        return iterator.current();
    }
}
