import java.util.Random;

/**
 * Created by kond on 2017. 02. 25..
 */
public class Pirate {
  /** Properties **/
  protected String name;
  protected int rumCount;
  protected Boolean alive;

  public static String[] pirateFirstNames = {"Derek", "Walsh", "Halliwell", "Twyford", "Modred", "Tab",
          "Frost", "Beamer", "Halford", "Thornton"};
  public static String[] pirateFameNames = {"Fierce", "Killer", "Shifty", "Privateer", "Landlubber",
          "Silver Hair", "Gray Beard", "Privateer", "Crazy Eyes", "First Mate"};
  public static String[] pirateLastNames = {"Ward", "Lynk", "Orfeo", "Smithy", "Reks", "Smith",
          "Roscoe", "Lexx", "Bentley", "Crawford"};

  /** Constructors **/
  public Pirate(String name) {
    this.name = name;
    this.rumCount = 0;
    this.alive = true;
  }

  /** Getters **/
  public Boolean isAlive() {
    return this.alive;
  }

  public String getName() {
    return name;
  }

  public int getRumCount() {
    return rumCount;
  }

  public String getState() {
    String state;
    if(this.alive) {
      if(this.rumCount < 5) {
        state = "fine";
      } else {
        state = "passes out";
      }
    } else {
      state = "dead";
    }
    state += " after " + this.rumCount + " rums";
    return state;
  }

  /** Setters **/

  /** Methods **/
  private void passOut() {
    this.rumCount = 0;
    System.out.println(this.name + " passed out and sleeps of all the rums...");
  }

  private String alreadyDead() {
    return this.name + "'s dead.";
  }

  public void drinkSomeRum() {
    if(this.alive) {
      rumCount++;
      //System.out.println(this.name + " drinks a rum. Now he had " + this.rumCount);
    } else {
      System.out.println(this.alreadyDead());
    }
  }

  public String howsItGoingMate() {
    System.out.println("How\'s it doin\' " + this.name + "? (" + this.rumCount + ")");
    String answer;
    if(this.alive) {
      if(this.rumCount < 5) {
        answer = "- Pour me anudder!";
      } else {
        answer = "- Arghh, I\'ma Pirate. How d\'ya d\'ink its goin?";
        passOut();
      }
    } else {
      answer = this.alreadyDead();
    }
    return answer;
  }

  public void die() {
    if(this.alive) {
      this.alive = false;
      //System.out.println(this.name + " died.");
    } else {
      System.out.println(this.alreadyDead());
    }
  }

  public void brawl(Pirate enemy) {
    Random rnd = new Random();

    if(this.alive && enemy.isAlive()) { // Check if they both alive
      if(this == enemy) { // Check if he should fight with himself
        System.out.println(this.name + " can't fight with himself ...");
      } else {
        System.out.println("!!!!! " + this.name + " attacks " + enemy.getName() + " !!!!!");
        int fightResult = rnd.nextInt(3);

        if(fightResult == 0) { // attacker dies
          this.die();
        } else if (fightResult == 1) { // enemy dies
          enemy.die();
        } else {
          this.passOut();
          enemy.passOut();
        }
      }
    } else if(!this.alive) {
      System.out.println(this.alreadyDead());
    } else {
      System.out.println(enemy.alreadyDead());
    }
  }
}
