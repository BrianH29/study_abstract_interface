import SpaceShipGame.EnemyUFO;
import SpaceShipGame.Rock;
import SpaceShipGame.SpaceShip;

public class Main {
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip(100,150);
        ship.shoot();
        ship.accelerate(250);

        EnemyUFO ufo = new EnemyUFO(50, 70);
        ufo.accelerate(100);
        ufo.explode();

        Rock rock = new Rock(100, 120);
        rock.explode();

        System.out.println("Ship at : " + ship.getX() + "," + ship.getY());
    }
}
