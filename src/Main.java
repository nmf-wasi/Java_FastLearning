import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static void main(String[] args) {
//      Generics: A concept where u write a class, interface  or methods
//        that is compatible for different data types

//        <T> type parameter -> placeholder that gets replaced
//            <String> type argument: specific the type

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");


//        Box box=new Box(); //Raw use of parameterized class 'Box'
        Box<String> box=new Box<>();
//        box.setItem(123); // gives error cause this doesn't take int

        box.setItem("Wasi"); //ook, cause it's a string


    }


}


