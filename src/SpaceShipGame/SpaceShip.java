package SpaceShipGame;

public class SpaceShip extends GameObject implements Moveable, Exploadable{
    private int bullet;
    private boolean fire;

    public void shoot(){
        System.out.println("FIRE!!!! FIRE!!!!");
    }

    public SpaceShip(int x, int y) {
        super(x, y);
    }

    public int getBullet() {
        return bullet;
    }

    public void setBullet(int bullet) {
        this.bullet = bullet;
    }

    public boolean isFire() {
        return fire;
    }

    public void setFire(boolean fire) {
        this.fire = fire;
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Ship has accelerated : " + speed);
    }

    @Override
    public void explode() {
        System.out.println("SPACE SHIP EXPLODED ... ");
    }
}
