public abstract class Animal extends Organism{
    boolean isAlive;
    Animal(){isAlive=true;}
    void eat(){
        System.out.println("Eating food!");
    }
    void breathe(){
        System.out.println("Breathing like an animal");
    }

    abstract void speak();

}
