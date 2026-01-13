import java.util.Scanner;

public class Main {
    static void main(String[] args) {
// runtime polymorphism is polymorphism decided by user's choice

//        Animal animal=new Animal(); // not possible because it's abstract clas
// We will not instantiate it, just declare a var

        Animal animal;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Dog or 2.Car?");
        int choice=scanner.nextInt();
        if(choice==1){
            animal=new Dog();
            animal.speak();
        }else{
            animal=new Cat();
            animal.speak();
        }


    }
}


