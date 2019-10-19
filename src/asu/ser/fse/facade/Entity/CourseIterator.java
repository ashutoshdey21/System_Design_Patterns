package asu.ser.fse.facade.Entity;

import java.util.Iterator;
import java.util.List;

public class CourseIterator extends ListIterator<Course> {

    int index;
    int size;
    List<Course> courseList;

    public CourseIterator(List<Course> courseList){
        this.courseList = courseList;
        this.size = courseList.size();
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
    public Course next() {

        if(this.hasNext()) {
            Course course = this.courseList.get(this.index);
            this.index = this.index + 1;
            return course;
        }
        return null;
    }

    @Override
    public Course remove() {
        Course course = null;
        try {
            course=courseList.get(index);
            this.courseList.remove(index);
            System.out.println("Removing index " + index);

        }
        catch(NullPointerException e) {
            System.out.println("Element not found in the Iterator");
        }
        return course;
    }

    @Override
    public void moveToHead() {

        this.courseList.add(0,this.courseList.remove(this.index));

    }


    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator iterator() {
        return null;
    }
}
