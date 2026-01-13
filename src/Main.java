import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    static void main(String[] args) {
//  anynomous class

        Dog dog=new Dog();
        dog.speak();

//        Suppose we have a talking dog, scooby do

    TalkingDog talkingDog=new TalkingDog();
    talkingDog.speak();

//    just for one extra func, we have to create a whole new class

//     now lets use annynomous class

        Dog dog2=new Dog(){
          @Override
          void speak(){
              System.out.println("This dog speaks!");
          }
        };
        dog2.speak();

    }
}


