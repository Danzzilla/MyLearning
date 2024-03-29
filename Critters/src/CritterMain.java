// CSE 142 Homework 9 (Critters)
// Authors: Stuart Reges and Marty Stepp
//          modified by Kyle Thayer
//
// CritterMain provides the main method for a simple simulation program.  Alter
// the number of each critter added to the simulation if you want to experiment
// with different scenarios.  You can also alter the width and height passed to
// the CritterFrame constructor.

public class CritterMain {
    public static void main(String[] args) {
        CritterFrame frame = new CritterFrame(60, 40);

        // uncomment each of these lines as you complete these classes
        frame.add(15, Bear.class);
        frame.add(15, Lion.class);
        frame.add(15, Giant.class);
        frame.add(15, Gator.class);
        frame.add(15, Eagle.class);
        frame.add(15, FlyTrap.class);
        frame.add(15, Food.class);

        frame.start();
    }
}
