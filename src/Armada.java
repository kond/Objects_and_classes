import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by kond on 2017. 02. 26..
 */
public class Armada {
  /** Properties **/
  protected String name;
  protected ArrayList<Ship> fleet = new ArrayList<Ship>();
  protected int battlesWon = 0;
  protected static ArrayList<String> armadaNames = new ArrayList<String>(Arrays.asList(
          "Zynt'aia Spice Guardians", "Valius Ying's gang", "Order of Independent Trade",
          "Flux Screw fleet", "Hiitite Ravagers", "Eyttyrmin Batiiv", "Dharus' Buccaneers",
          "Maramere sea pirates", "Chorran shipjacker", "Blood Bone Order"));


  /** Constructors **/
  public Armada() {
    Random rnd = new Random();
    this.name = armadaNames.get(rnd.nextInt(armadaNames.size()));
    armadaNames.remove(this.name);
  }

  /** Getters **/
  /** Setters **/

  /** Methods **/
  public void establishArmada() {
    Random rnd = new Random();

    int shipsInFleet = rnd.nextInt(19) + 1;
    for(int i=0; i<shipsInFleet; i++) {
      Ship s = new Ship();
      s.fillShip();
      this.fleet.add(s);
    }
    System.out.println(shipsInFleet + " ships joined to " + this.name + " armada");
    System.out.println();
  }

  public Boolean war(Armada otherArmada) {
    System.out.println();
    System.out.println("###################### THE WAR BEGUN ######################");
    System.out.println();
    Boolean result;
    Armada winner;
    Armada loser;

    ArrayList<Ship> fleet1 = this.fleet;
    ArrayList<Ship> fleet2 = otherArmada.fleet;

    Iterator<Ship> fleet1Iterator = fleet1.iterator();
    Iterator<Ship> fleet2Iterator = fleet2.iterator();
    Ship fleet1Ship = fleet1Iterator.next();
    Ship fleet2Ship = fleet2Iterator.next();

    int fleet1ShipsLeft = fleet1.size();
    int fleet2ShipsLeft = fleet2.size();

    while(fleet1ShipsLeft > 0 && fleet2ShipsLeft > 0) {

      if(fleet1Ship.battle(fleet2Ship)) {
        this.battlesWon++;
        fleet2ShipsLeft--;
        if(fleet2Iterator.hasNext()) {
          fleet2Ship = fleet2Iterator.next();
        }
      } else {
        otherArmada.battlesWon++;
        fleet1ShipsLeft--;
        if(fleet1Iterator.hasNext()) {
          fleet1Ship = fleet1Iterator.next();
        }
      }
      System.out.println(this.name + ": " + this.battlesWon + "\t" +
              otherArmada.name+ ": " + otherArmada.battlesWon + "\t");
      System.out.println(this.name + " has " + fleet1ShipsLeft + " ships left");
      System.out.println(otherArmada.name + " has " + fleet2ShipsLeft + " ships left");
    }

    if(fleet2ShipsLeft == 0) {
      result = true;
      winner = this;
      loser = otherArmada;
    } else {
      result = false;
      winner = otherArmada;
      loser = this;
    }

    System.out.println();
    System.out.println("HURRAY, " + winner.name + " WON THE WAR!!!!!!");
    System.out.println("They have " + (winner.fleet.size() - loser.battlesWon) + " ships left.");

    return result;
  }

}
