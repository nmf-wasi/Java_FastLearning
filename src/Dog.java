public class Dog extends Animal{
    @Override //polymorphism
    void eat() {
        System.out.println("Eating Dog food");
    }

    @Override
    void speak() {
        System.out.println("bark!");
    }
}
