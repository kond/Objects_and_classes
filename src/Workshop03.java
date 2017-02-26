import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by kond on 2017. 02. 25..
 */
public class Workshop03 {
  public static void main(String[] args) {
    Random rnd = new Random();

    // Define pirates
    for(int i=0; i<20; i++) {
      String firstName = Pirate.pirateFirstNames[rnd.nextInt(Pirate.pirateFameNames.length)];
      String fameName = Pirate.pirateFameNames[rnd.nextInt(Pirate.pirateFameNames.length)];
      String lastName = Pirate.pirateLastNames[rnd.nextInt(Pirate.pirateLastNames.length)];

      Pirate p = new Pirate(firstName + " \'" + fameName + "\' " + lastName);
    }

    int piratePartyLength = 50;

    /*
    // Let's drink
    System.out.println();
    System.out.println("### LET\'S DRINK ###");
    System.out.println();
    for(int i=0; i<piratePartyLength; i++) {
      pirates.get(rnd.nextInt(pirates.size())).drinkSomeRum();
    }

    // Ask random guys how's it going
    System.out.println();
    System.out.println("### NOW ASK SOME GUYS ###");
    for(int i=0; i<10; i++) {
      System.out.println();
      System.out.println(pirates.get(rnd.nextInt(pirates.size())).howsItGoingMate());
    }

    // Let's fight!
    System.out.println();
    System.out.println("### FIGHT ###");
    for(int i=0; i<10; i++) {
      System.out.println();
      pirates.get(rnd.nextInt(pirates.size())).brawl(pirates.get(rnd.nextInt(pirates.size())));
    }
    */

  }
}
