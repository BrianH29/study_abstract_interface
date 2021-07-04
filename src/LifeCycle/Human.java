package LifeCycle;

public abstract class Human extends Creature implements Talkable{

    public Human(int age) {
        super(age);
    }

    @Override
    public void eat(){
        System.out.println("WE HUMANS NEED TO EAT TO SURVIVE");
    }

    @Override
    public void attack(){
        System.out.println("WE ONLY FIGHT IF YOU START THE FIGHT");
    }

    @Override
    public void talk() {
        System.out.println("WE HUMANS CAN SPEAK, WE CREATED LANGUAGE");
    }
}
