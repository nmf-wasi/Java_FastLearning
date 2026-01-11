import java.util.Scanner;

public class Main {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your name: ");
        System.out.print("Enter your name: ");
//        String name=scanner.nextLine();  // takes in whole line
        String name = scanner.next(); //takes in only one word
        System.out.println(name);
//        System.out.print(name);

        System.out.print("Enter your age: ");
//        scanner.nextInt();//takes in next int
        System.out.println(scanner.nextInt());

        System.out.print("Enter your GPA: ");
        double gpa=scanner.nextDouble();
        System.out.println("GPA: "+gpa);

        // common issue is to encounter an extra newline after numbers, if u use nextInt and then nextLine, then u will encounter this,
        // to avoid this, use scanner.nextLine() before taking input of the line


        scanner.close();
    }

}
