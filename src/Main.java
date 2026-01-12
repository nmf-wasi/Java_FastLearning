import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

//   variable number of arguments

        add(1, 2, 3, 4, 5, 6, 8);

    }

    static void add(int... numbers) {
        for (int num : numbers)
            System.out.println(num);
    }

}
