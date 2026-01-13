public class Main {
    static void main(String[] args) {
//      Generics: A concept where u write a class, interface  or methods
//        that is compatible for different data types

//        <T> type parameter -> placeholder that gets replaced
//            <String> type argument: specific the type

        Product<String, Double> product1 = new Product<>("wasi", 0.01);
        Product<String, Integer> product2 = new Product<>("wasi", 12);
        System.out.println(product1);
        System.out.println(product2);

    }
}


