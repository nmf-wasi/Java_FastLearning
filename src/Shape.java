public abstract class Shape {
//    abstract classes can't be initiated
//    abstract method can contain abstract methods and concrete methods
//    abs method -> must be implemented by it's children

    abstract double area();

//    concrete method

    void display(){
        System.out.println("This is a shape"); // not needed to be changed in child classes
    }
}
