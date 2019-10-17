package asu.ser.fse.facade.Entity;

import java.util.Iterator;

public class CourseIterator extends ListIterator<Course> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Course next() {
        return null;
    }

    @Override
    public Course remove() {
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
    public Iterator<Course> iterator() {
        return null;
    }
}
