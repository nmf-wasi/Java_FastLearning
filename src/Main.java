import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  Compound interest calculator
        int principal;
        double interestRate;
        short year;
        short timesCompounded;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        principal=scanner.nextInt();

        System.out.print("Enter interest rate in %: ");
        interestRate=scanner.nextDouble();
        interestRate/=100;

        System.out.print("Enter years: ");
        year=scanner.nextShort();

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded=scanner.nextShort();

        System.out.println("Total interest : " +principal*Math.pow((1+interestRate/timesCompounded), year));
    }

}
