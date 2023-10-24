package heaps;

public class BinaryHeapQueue implements IPriorityQueue{
    private static final int INITIAL_HEAP_SIZE = 10;
    private int[] heap;
    private int size;
    private int nextAvailableIndex = 1;

    public BinaryHeapQueue(){
        heap = new int[INITIAL_HEAP_SIZE];
    }

    @Override
    public void insert(int element) {
        //add the new element to the tree (at the next available index)
        heap[nextAvailableIndex] = element;
        //swim and adjust the ordering of the elements
        swim(nextAvailableIndex);

        nextAvailableIndex++;
        size++;
    }

    private void swim(int currentIndex) {
        int parentIndex = currentIndex / 2;

        while(parentIndex >= 1) {
            if (heap[parentIndex] > heap[currentIndex]) {
                //swap them
                swap(parentIndex, currentIndex);

            }else{
                break; //stop and short-circuit
            }

            //move to our parent element
            currentIndex = parentIndex;
            parentIndex = currentIndex / 2;
        }
    }

    //this method swaps index "first" and index "second" in our heap array
    private void swap(int firstIndex, int secondIndex){
        int temp = heap[firstIndex];
        heap[firstIndex] = heap[secondIndex];
        heap[secondIndex] = temp;
    }

    @Override
    public int remove() {
        checkIfEmpty();

        //save the value at the root (highest priority)
        int result = heap[1];

        //replace the value at the root
        heap[1] = heap[nextAvailableIndex - 1];
        heap[nextAvailableIndex - 1] = 0;

        //sink and adjust our heap and counters
        size--;
        sink(1);
        nextAvailableIndex--;

        return result;
    }

    private void sink(int currentIndex) {
        //sink as long as the current index has a child
        while(currentIndex <= size / 2){
            int leftChildIndex = 2 * currentIndex;
            int rightChildIndex = 2 * currentIndex + 1;

            //find the smaller child
            int smallestChildIndex = leftChildIndex;

            //if there is a right child and it's smaller
            if(rightChildIndex < nextAvailableIndex - 1 &&
                heap[rightChildIndex] < heap[rightChildIndex]){
                smallestChildIndex = rightChildIndex;
            }

            //figure out whether a child is smaller
            if(heap[currentIndex] > heap[smallestChildIndex]){
                swap(currentIndex, smallestChildIndex);
            }else{
                break; //short-circuit if we are in order
            }

            //move to the smallest child and repeat our condition
            currentIndex = smallestChildIndex;
        }
    }

    @Override
    public int peek() {
        checkIfEmpty();

        return heap[1];
    }

    private void checkIfEmpty() {
        if(size == 0){
            throw new IllegalStateException("The heap is empty");
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        //Bracket for array
        string.append("[");

        for(int i = 0; i < heap.length; i++){
            //Add element to string
            string.append(heap[i]);

            //No coma for last element
            if(i != heap.length - 1){
                string.append(", ");
            }
        }

        //Bracket for array
        string.append("]");

        //Return string as String
        return string.toString();
    }
}
