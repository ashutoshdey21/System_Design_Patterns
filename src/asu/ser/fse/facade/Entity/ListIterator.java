package asu.ser.fse.facade.Entity;

public abstract class ListIterator<Item> implements Iterable<Item> {

    public abstract boolean hasNext();
    public abstract Item next();
    public abstract Item remove();
    public abstract void moveToHead();


}
