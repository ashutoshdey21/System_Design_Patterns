package asu.ser.fse.facade.Entity;

import java.util.Iterator;

public class SolutionIterator extends ListIterator<Solution> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Solution next() {
        return null;
    }

    @Override
    public Solution remove() {
        return null;
    }

    @Override
    public void moveToHead() {

    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Solution> iterator() {
        return null;
    }
}
