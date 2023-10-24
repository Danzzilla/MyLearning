package copy;

public class Car {
    private String make;
    private String model;
    private Engine engine;


    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }
/*
    // shallow memory copy of mutable Objects
    public Car(Car other) {
		this.make = other.make;
        this.model = other.model;
        this.engine = other.engine;
    }
    */


	//deep memory copy of mutable Objects
	public Car(Car other){
		this.make = other.make;
        this.model = other.model;
        this.engine = new Engine(other.engine);
	}



    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }


    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [make=" + getMake() + ", model=" + getModel() + ", engine=" + getEngine()
                + "]";
    }

}
