package test;

import union_find.DisjointSets;

public class Main {
    public static void main(String[] args) {
        DisjointSets sets = new DisjointSets(5);

        //joijn sets 0/1 and 2/3
        sets.union(0, 1);
        sets.union(2, 3);

        //determine if set ownership is working
        System.out.println(sets.find(0));
        System.out.println(sets.find(1));

        System.out.println();
        System.out.println(sets.find(2));
        System.out.println(sets.find(3));
    }
}
