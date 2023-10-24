package sorts;

public class MergeSorter {
    private int[] auxArray;

    public void mergeSort(int[] array){
        //is the array already sorted?
        if(array.length <= 1){
            return; //already sorted!
        }

        //create the aux array for use in merge()
        auxArray = new int[array.length];

        mergeSort(array, 0, array.length - 1);
    }

    //hide the recursive implementation of merge sort
    private void mergeSort(int[] array, int low, int high){
        //base case, the sub-array is one or less elements
        if(high - low <= 0){
            return; //the sub-array is already sorted
        }

        //perform the divide and conquer
        //divide - recursively split up the array until left and right sides are sorted
        //conquer - merge the left and right sorted sub-array
        int mid = (low + high) / 2;

        //recursively sort the left and right sub-arrays
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        //merge
        merge(array, low, high);
    }

    private void merge(int[] array, int low, int high){

    }
}
