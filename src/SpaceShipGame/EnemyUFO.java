package SpaceShipGame;

public class EnemyUFO extends GameObject implements Moveable, Exploadable{

    private int size;

    public EnemyUFO(int x, int y) {
        super(x, y);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void accelerate(int speed) {

    }

    @Override
    public void explode() {
        System.out.println("UFO explode BOOM!!!!");
    }
}
