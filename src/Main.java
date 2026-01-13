import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//  Exceptions -> causes interruption in normal flow of the program
//        ex: Div by 0, file not found and so on
//        use try{risky_code}, catch{the exception}, finally {do this anyway}

        try{
            System.out.println(1/0);
        }
        catch (ArithmeticException  e){
            System.out.println("U cant divide by 0!");
            System.out.println(e.toString());;
        }
        catch (Exception e){ // not a good practice!
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("Done!");
        }



    }
}


