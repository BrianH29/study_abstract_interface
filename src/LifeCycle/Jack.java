package LifeCycle;

public class Jack extends Human implements Cooker, Swimmable{

    public Jack(int age) {
        super(age);
    }

    @Override
    public void code() {
        System.out.println("HELLO JAVA WORLD");
    }


    @Override
    public void swim() {

    }

    @Override
    void printInfo(){
        System.out.println("JACK -> " + toString());
    }
}
