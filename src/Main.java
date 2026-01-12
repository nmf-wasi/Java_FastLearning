import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

//      take user input into array

//        String [] hooman={"Wasi", "Lia", "Kel"};

        String[] hooman = new String[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of the hooman: ");
            hooman[i] = scanner.nextLine();
        }
        for (String hoo : hooman)
            System.out.println(hoo);
        scanner.close();

    }

}
