package driver;

import structures.Bag;

public class BagTest {
    public static void main(String[] args) {
        Bag<String> bagOfColors = new Bag<String>(5);
        System.out.println(bagOfColors.isEmpty());

        bagOfColors.add("Red");
        bagOfColors.add("Green");
        bagOfColors.add("Yellow");
        bagOfColors.add("Blue");
        bagOfColors.add("Purple");
        bagOfColors.add("Beige");

        System.out.println(bagOfColors);

        try{
            Bag badBag = new Bag(-2);
            System.out.println("Bag is not working");
        }catch (IllegalStateException e){
            System.out.println("Bag is working");
        }

        Bag mil = new Bag(1000000);
        System.out.println("Started adding numbers");
        for (int i = 0; i < 1000000; i++) {
            mil.add(i);
        }
        System.out.println("Ended adding numbers");

        Bag sizer = new Bag(5);
        sizer.add(4);
        sizer.add(8);
        System.out.println(sizer);
        System.out.println("Size: " + sizer.size());
        System.out.println("Capacity: " + sizer.capacity());
        System.out.println("Contains 3: " + sizer.contains(3));
        System.out.println("Contains 8: " + sizer.contains(8));
    }
}
