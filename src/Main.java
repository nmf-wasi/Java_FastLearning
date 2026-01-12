import java.lang.reflect.Array;

public class Main {
    static void main(String[] args) {

      String [] fruits ={"apple", "banana", "coconut"};
        System.out.println(fruits);
        System.out.println(fruits[0]);
        fruits[2]="Pineapple";
        System.out.println(fruits[2]);


        System.out.println(fruits.length);

        for(String fruit :fruits) {
            System.out.println(fruit);
        }
    }

}
