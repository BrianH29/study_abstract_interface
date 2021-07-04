package LifeCycle;

public abstract class Creature {

    private int age;

    public Creature(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract void eat();
    abstract void attack();
    abstract void printInfo();

    @Override
    public String toString() {
        return "Creature{" +
                "age=" + age +
                '}';
    }
}
