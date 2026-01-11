import java.util.Random;
public class Main {
    public static void main(String[] args) {
//  PrintF


        String name="Wasi";
        char firstLetter='W';
        int age=19;
        double height=1520000.3;
        boolean isLoser=true;

        System.out.printf("Hello %s, %c, %d, %.2f, %b", name, firstLetter, age, height, isLoser);

        System.out.printf("\n+%,.2f", height);
        System.out.printf("\n% .3f", height);
        int id1=1;
        int id2=23;
        int id3=456;
        int id4=7890;
        // setting width
        System.out.printf("\n%4d", id1);
        System.out.printf("\n%04d", id2);
        System.out.printf("\n%-4d", id3);
        System.out.printf("\n%d", id4);

    }

}
