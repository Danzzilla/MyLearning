package copy;

import java.util.*;

public class Driver {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //request data for a new car
        System.out.println("Create a new Car object!");
        System.out.print("Enter Car Make: ");
        String make = console.nextLine();

        System.out.print("Enter Car Model: ");
        String model = console.nextLine();


        // create an Engine object
        Engine engine = createNewEngine(console);

        //create an object representing the car with the engine object
        Car car = new Car(make, model, engine);
        System.out.println("Original: " + car);

        // make a shallow memory copy of the car
        Car shallowCopy = new Car(car);
        System.out.println("Copy: " + shallowCopy);

        // break the engine of car
        System.out.println("Breaking Car Engine ....");
        car.getEngine().breakEngine();

        // change car manufacturer
        System.out.println("Change Car Manufacturer ....");
        car.setMake("Toyota");

        // is the shallowCopy  changed as well?
        System.out.println("Original: " + car);
        System.out.println("Copy:" + shallowCopy);

        // make a deep memory copy of the car
        //Car deepCopy = new Car(car);
        //System.out.println(deepCopy);

        // break the engine of car
        //car.getEngine().breakEngine();

        // is the deepCopy Engine changed as well?
        //System.out.println(car);
        //System.out.println(deepCopy);

    }


    private static Engine createNewEngine(Scanner console) {
        //get engine fields
        System.out.print("Enter Engine Manufacturer: ");
        String manufacturer = console.nextLine();

        //create the engine
        Engine engine = new Engine(manufacturer);

        return engine;
    }



}
