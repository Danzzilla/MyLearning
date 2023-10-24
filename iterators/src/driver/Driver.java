package driver;

import classes.FileReader;

/**
 * Driver class for FileReader
 * @author Daniel Svirida
 * @version 1
 */
public class Driver {
    /**
     * main
     * @param args array of arguments
     */
    public static void main(String[] args) {
        FileReader reader = new FileReader("war_and_peace.txt");

        for(String line : reader){
            System.out.println(line);
        }
    }
}
