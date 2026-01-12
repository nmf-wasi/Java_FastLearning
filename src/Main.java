import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static void main(String[] args) {

      String [] fruits ={"apple", "banana", "coconut"};
        System.out.println(fruits);
        System.out.println(fruits[0]);
        fruits[2]="pineapple";
        System.out.println(fruits[2]);


        System.out.println(fruits.length);

        for(String fruit :fruits) {
            System.out.println(fruit);
        }
        Arrays.sort(fruits);
        for(String fruit :fruits) {
            System.out.println(fruit);
        }
        Arrays.fill(fruits, "wasi");
        for(String fruit :fruits) {
            System.out.println(fruit);
        }



    }

}
