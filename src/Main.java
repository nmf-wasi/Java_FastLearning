public class Main {
    static void main(String[] args) {

        Car car1 = new Car("BMW X5", "black", 2022, 200000);
        Car car2 = new Car("BMW X5", "black", 2022, 200000);
        car1.start();
        car1.drive();
        car1.stop();
        System.out.println(Car.numOfCars);
    }

}


