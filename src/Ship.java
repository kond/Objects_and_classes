import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kond on 2017. 02. 26..
 */
public class Ship {
  /** Properties **/
  protected int id;
  protected String name;
  protected ArrayList<Pirate> crew = new ArrayList<Pirate>();
  protected Pirate captain;

  public static int shipCount = 0;
  private static String[] shipNames = {"The Kraken", "Devil\'s Whore", "Davy Jone\'s Executioner",
          "The Bloody Shame", "Neptune\'s Whore", "Satan\'s Mermaid", "Black Charlatan",
          "Devil\'s Maw", "Privateer\'s Death", "Rogue Wave", "Kiss of Death",
          "Night\'s Dirty Lightning", "Devil\'s Doom", "Monkeebutt", "Ghostly Seadog",
          "The Wicked Wench", "Sea Nymph", "Privateer\'s Scream", "Devil\'s Cursed Storm",
          "The Black Heart Wench", "Cursed Sea-Dog", "The Howling Lusty Wench",
          "Scourge of the Seven Seas"};

  /** Constructors **/
  public Ship() {
    Random rnd = new Random();
    this.id = shipCount;
    shipCount++;
    this.name = shipNames[rnd.nextInt(shipNames.length)];
  }

  /** Getters **/
  public int getCrewCount() {
    return this.crew.size();
  }

  /** Setters **/

  /** Methods **/
  private void addRandomPirate() {
    Random rnd = new Random();

    String firstName = Pirate.pirateFirstNames[rnd.nextInt(Pirate.pirateFameNames.length)];
    String fameName = Pirate.pirateFameNames[rnd.nextInt(Pirate.pirateFameNames.length)];
    String lastName = Pirate.pirateLastNames[rnd.nextInt(Pirate.pirateLastNames.length)];

    Pirate p = new Pirate(firstName + " \'" + fameName + "\' " + lastName);
    this.crew.add(p);
  }

  private void announceCaptain() {
    Random rnd = new Random();
    this.captain = this.crew.get(rnd.nextInt(this.crew.size()));
  }

  private ArrayList<Pirate> getAliveCrew() {
    ArrayList<Pirate> alivePirates = new ArrayList<Pirate>();
    for(Pirate p : this.crew) {
      if(p.isAlive()) {
        alivePirates.add(p);
      }
    }
    return alivePirates;
  }

  private int countAliveCrewMembers() {
    ArrayList<Pirate> aliveCrew = this.getAliveCrew();
    return aliveCrew.size();
  }

  private void killSomePirates() {
    Random rnd = new Random();

    ArrayList<Pirate> aliveCrew = this.getAliveCrew();
    int alivePirateCount = aliveCrew.size();
    int kills = 1 + rnd.nextInt((alivePirateCount - 1)); // at least 1 pirate should die

    System.out.println(kills + " pirates died on " + this.showName());

    while(kills > 0) {
      int killId = rnd.nextInt(alivePirateCount);
      Pirate pirateToKill = aliveCrew.get(killId);

      if(pirateToKill.isAlive()) {
        pirateToKill.die();
        kills--;
      }
    }
  }

  private void party() {
    Random rnd = new Random();

    ArrayList<Pirate> aliveCrew = this.getAliveCrew();
    int alivePirateCount = aliveCrew.size();

    int rumsForTheParty = rnd.nextInt(alivePirateCount * 2);

    for(int i=0; i<rumsForTheParty; i++) {
      aliveCrew.get(rnd.nextInt(alivePirateCount)).drinkSomeRum();
    }

    System.out.println(this.showName() + " crew had a party with " + rumsForTheParty + " rums");
  }

  private void show() {
    System.out.println(this.showName() +
            " with CAPTAIN " + this.captain.getName() + " (" + this.captain.getState() + ")" +
            " has " + this.countAliveCrewMembers() + " alive pirates on board.");
  }

  private String showName() {
    return "SHIP [" + this.id + "] " + this.name;
  }

  public void fillShip() {
    Random rnd = new Random();
    int crewCount = rnd.nextInt(99) + 1;

    for(int i=0; i<crewCount; i++) {
      addRandomPirate();
    }

    announceCaptain();
    //System.out.println("Ship filled:");
    //this.show();
  }

  public Boolean battle(Ship otherShip) {
    System.out.println("================ ATTACK ===============");
    System.out.println(this.showName() + " attacks " + otherShip.showName());
    System.out.println();
    this.show();
    otherShip.show();
    System.out.println();

    Boolean result;

    int shipScore = this.countAliveCrewMembers() - this.captain.getRumCount();
    int otherShipScore = otherShip.countAliveCrewMembers() - otherShip.captain.getRumCount();

    Ship loser = (shipScore > otherShipScore) ? otherShip : this;
    Ship winner = (shipScore > otherShipScore) ? this : otherShip;

    System.out.println("The winner is: " + winner.showName());

    result = (winner == this) ? true : false;

    loser.killSomePirates();
    winner.party();

    System.out.println("=======================================");
    return result;
  }
}
