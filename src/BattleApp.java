/**
 * Created by kond on 2017. 02. 26..
 */
public class BattleApp {
  public static void main(String[] args) {
    Ship ship1 = new Ship();
    Ship ship2 = new Ship();

    ship1.fillShip();
    ship2.fillShip();

    ship1.battle(ship2);
  }

}
