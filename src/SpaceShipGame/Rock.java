package SpaceShipGame;

public class Rock extends GameObject implements Exploadable{

    private int mass;

    public Rock(int x, int y) {
        super(x, y);
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    @Override
    public void explode() {
        System.out.println("ROCK smashed!");
    }
}
