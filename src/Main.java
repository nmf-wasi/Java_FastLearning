public class Main {
    static void main(String[] args) {

//        Shape shape=new Shape();
//    error, we can't create an obj from Shape class
        Circle circle=new Circle(5);

        circle.display();
        System.out.println(circle.area());
    }
}


