package LifeCycle;

public abstract class Animal extends Creature{
    public Animal(int age) {
        super(age);
    }

    @Override
    void eat(){
        System.out.println("WE ANIMALS EAT EVERYTHING EVEN YOU HUMANS!!");
    }

    @Override
    void attack(){
        System.out.println("ANIMALS FIGHT TO LIVE");
    }
}
