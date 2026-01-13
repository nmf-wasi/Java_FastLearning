import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//  array lists only works with obj
//        arrayList is a resizable array whereas, arrays are fixed ize

        ArrayList<String> list=new ArrayList<String>();
        list.add("Yuna");
        list.add("Lia");
        list.add("Wasi");
        list.remove(0);
        list.set(0,"Ryu");
        System.out.println(list.get(1));;
        list.add("Yeji");
        list.add("Kel");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);



    }
}


