import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

//   2D arrays
        String [] itzy1={"yeji", "yuna", "lia"};
        String [] itzy2={"ryu", "chaer",};
        String [][] itzy={itzy1, itzy2};
        System.out.println(itzy);
        System.out.println(itzy1);
        System.out.println(itzy2);

//        for (String i : itzy)
        for (String[] i : itzy)
            System.out.println(Arrays.toString(i));

        for (String[] i : itzy) {
            for (String t : i)
                System.out.println(t);
        }

    }


}


