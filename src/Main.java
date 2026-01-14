import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {
    static void main(String[] args) {
//      enums: a special class that represents a fixed set of constants

//        Day day= new Day(); wrong way
        Day day = Day.THURSDAY;
        System.out.println(Day.SUNDAY);
        System.out.println(day.getDayNumber());
    }
}


