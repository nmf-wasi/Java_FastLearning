public class Main {
    public static void main() {
        //     1. declaring var
        int var_name;
        //    2. initializing Var
        int var_name2 = 12;
        //    3. Assigning var
        var_name = 15;

        System.out.println(var_name);
        System.out.println(var_name2);

//        var types:
//        Short, int, long, float, double, String, boolean


//        var= 2 types:
//                    Primitive: Simple val stored directly in memory (stack) -> short, int float bye, double
//                    Reference: Memory address (stack) that points to the (heap) -> string, array, obj


//        printing:
        System.out.println("The val is: " + var_name);
//    double
        double gpa=3.5;
        System.out.println("gpa".toUpperCase()+gpa);
        float price= 15.5f;
        System.out.println("Price: "+price);

        char grade='A';
        System.out.println("Grade: "+grade);

        char symbol='!';
        System.out.println(symbol);

        boolean isStudent=true;
        System.out.println(isStudent);
        System.out.println(!isStudent);

        if(!isStudent)
            System.out.println("Can't go in!");
        else
            System.out.println("Go in!");

        String name="nmf_wasi";
        System.out.println(name);
        name="Kel";
        System.out.println(name);
        System.out.println("Hi, "+name+'!');


    }

}
