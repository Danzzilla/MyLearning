package collections;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        //create a list
        Set<Integer> listOfNums = new HashSet<>();

        //add some elements to the list
        for (int i = 0; i <= 20; i++) {
            listOfNums.add(i);
        }

        System.out.println("Size: " + listOfNums.size());
        System.out.println("contains(10)?: " + listOfNums.contains(10));

        //loop over all elements and print them out
        for (int num : listOfNums) {
            System.out.println(num);
        }
    }
}
