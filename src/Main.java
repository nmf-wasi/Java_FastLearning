import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//  wrapper classes allow primitive vals (int char, double, bool) to be used as obj

//        this wraps them in obj, Dont use unless u need an obj

//        int a=123;

    Integer a= new Integer(123); //wrapper class

//        auto boxing:
       Integer a1= 123; //wrapper class
        String e="pizza";
//        unboxing
        int x=a;

//        benefits: 1. allows access to some advanced methods, ex:
        String s= Integer.toString(123);
        System.out.println(s+s);//123123


        int i=Integer.parseInt("1234");
        System.out.println(i+i);// 2468
    }
}


