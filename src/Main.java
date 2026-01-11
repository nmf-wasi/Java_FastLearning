import java.util.Scanner;

public class Main {
    public static void main() {
        // calculate area of a rectangle

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        Double height=scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        Double width=scanner.nextDouble();

        System.out.println("Area: "+height*width);
        scanner.close();
    }

}
