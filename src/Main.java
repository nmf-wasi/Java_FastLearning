import java.util.Random;
public class Main {
    public static void main() {
//  Random numbers


        Random random=new Random();

        int number1;
//          number=random.nextInt(); // gives a huge number
        number1=random.nextInt(1,5+1); // will give a number between 1-5
        System.out.println(number1);

//        random doubles

        double number2= random.nextDouble();
        System.out.println(number2);
        // random boolean
        boolean num3=random.nextBoolean();
        System.out.println(num3);

        if(random.nextBoolean()) System.out.println("HEADS!");
        else System.out.println("TAILS!");
    }

}
