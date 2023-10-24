package structures;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Random;

public class Bag<T> implements ICollection<T>, Iterable<T>{
    //Store our elements in an array
    private T[] data;
    private int nextIndex = 0;
    private boolean changeMade = false;

    //this modification count will keep track of how
    //many changes are made to the data structure
    private int modCount = 0;

    public Bag(int capacity){
        //precondition(s)
        if(capacity < 0) throw new IllegalStateException("Capacity must be non-negative");

        //workaround is to create an object array and cast it
        //to a generic array (due to type erasure)
        data = (T[]) new Object[capacity];
    }

    /**
     * Adds a new object to the collection
     *
     * @param element the new object o add
     * @return true if the element was added, otherwise false
     */
    @Override
    public boolean add(T element) {
        //is the bag full?
        if(nextIndex == data.length){
            return false;
        }

        data[nextIndex] = element;
        nextIndex++;
        changeMade = true;
        modCount++;
        return true;
    }

    /**
     * Reports whether an element is found in the collection
     *
     * @param element the element to search for
     * @return true if the element was found, otherwise false
     */
    @Override
    public boolean contains(T element) {
        for (int i = 0; i < nextIndex; i++) {
            if(data[i].equals(element)){ // == will compare memory addresses of the objects
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the first occurrence of the input parameter
     *
     * @param element the element to find and remove
     * @return true if the element was found and removed, otherwise false
     */
    @Override
    public boolean remove(T element) {
        return false;
    }

    /**
     * Return a random element from the collection
     * @return a random element or null if none are present
     */
    @Override
    public T random(){
        if(isEmpty()) return null;

        Random random = new Random();
        int randomIndex = random.nextInt(size());
        return data[randomIndex];
    }

    /**
     * Returns the number of elements in the collection
     *
     * @return the number of elements
     */
    @Override
    public int size() {
        return nextIndex;
    }

    /**
     * Returns the number of elements that can fit in the bag
     * @return the number of elements
     */
    public int capacity(){
        return data.length;
    }

    /**
     * Returns whether the collection is empty
     *
     * @return true if empty, otherwise false
     */
    @Override
    public boolean isEmpty() {
        return data[0] == null;
    }

    /**
     * Removes all elements in the collection
     */
    @Override
    public void clear() {
        modCount++;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new BagIterator();
    }

    /**
     * @return Bag as String
     */
    @Override
    public String toString(){
        return Arrays.toString(data);
    }

    /**
     * This is a "smart object" that knows how to retrieve
     * all elements from the bag
     */
    private class BagIterator implements Iterator{
        //this is the index of the next element being returned
        //from the iterator
        private int position = 0;
        private int savedModCount;

        public BagIterator(){
            savedModCount = modCount;
        }

        @Override
        public boolean hasNext(){
            if(changeMade){
                throw new ConcurrentModificationException(
                        "The Bag was changed while using the iterator");
            }

            //is the curren position of the iterator
            //less than the unused spot
            return position < nextIndex;
        }

        @Override
        public T next(){
            if(changeMade){
                throw new ConcurrentModificationException(
                        "The Bag was changed while using the iterator");
            }

            //save the next element returned by the iterator
            T result = data[position];

            //move the iterator
            position++;

            return result;
        }
    }
}
