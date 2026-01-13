public class Main {
    static void main(String[] args) {
// polymorphism means different shape of same thing, means same name methods but with different functions
        Vehicle [] vehicles={new Car(), new Bike()};
        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}


