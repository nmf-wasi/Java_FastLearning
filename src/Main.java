public class Main {
    static void main(String[] args) {

        String day="Monday";
        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday","Friday" -> System.out.println("Weekday >_<");
            case "Saturday", "Sunday" -> System.out.println("Weekend ^--^");
        }
    }

}
