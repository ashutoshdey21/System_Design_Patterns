package asu.ser.fse.facade.Entity;

import java.util.Iterator;
import java.util.List;

public class SolutionIterator extends ListIterator<Solution> {

    int index;
    int size;
    List<Solution> solutionList;

    public SolutionIterator(List<Solution> solutionList){
        this.solutionList=solutionList;
        this.size = solutionList.size();
        this.index= 0;
    }

    @Override
    public boolean hasNext() {
        if( index < this.size) {
            return true;
        }
        return false;
    }

    @Override
    public Solution next() {
        if(this.hasNext()) {
            Solution solution = this.solutionList.get(this.index);
            this.index = this.index + 1;
            return solution;
        }
        return null;
    }

    @Override
    public Solution remove() {
        Solution solution = null;
        try {
            solution=solutionList.get(index);
            this.solutionList.remove(index);
            System.out.println("Removing index " + index);

        }
        catch(NullPointerException e) {
            System.out.println("Element not found in the Iterator");
        }
        return solution;
    }

    @Override
    public void moveToHead() {

        this.solutionList.add(0,this.solutionList.remove(this.index));

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
