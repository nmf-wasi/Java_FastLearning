public class Car extends Vehicle{
    public Car() {
        this(null, null, 0, 0, false);
    }

    @Override
    void go() {
        System.out.println("Car is running!");
    }

    String model;
    String color;
    int year;
    double price;
    boolean isRunning;

    static int numOfCars=0;

    //    constructor
    public Car(String model, String color, int year, double price, boolean isRunning) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.isRunning = isRunning;
        numOfCars++;
    }

    //    overloading constructors
    public Car(String model, String color, int year, double price) {
        this(model, color, year, price, false);
    }

    public Car(String model, String color, double price) {
        this(model, color, 0, price, false);
    }


    //    methods
    void start() {
        isRunning = true;
        System.out.println("You start the car");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stopped the car");
    }

    void drive() {
        System.out.println("You drive the " + model);
    }


}
