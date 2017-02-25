import java.util.ArrayList;

/**
 * Created by kond on 2017. 02. 24..
 */
public class Car {
  //Add somethings here to create a car and some fields
  private String color;
  private int sizeEngine;
  private String tyCar;
  private int kmOdometer;
  protected static ArrayList<Car> cars = new ArrayList<Car>();


  /** Getters **/

  public String getColor() {
    return color;
  }

  public int getSizeEngine() {
    return sizeEngine;
  }

  public String getTyCar() {
    return tyCar;
  }

  public int getKmOdometer() {
    return kmOdometer;
  }

  public static ArrayList<Car> getCars() {
    return cars;
  }

  /** Setters **/

  public void setColor(String color) {
    this.color = color;
  }

  public void setSizeEngine(int sizeEngine) {
    this.sizeEngine = sizeEngine;
  }

  public void setTyCar(String tyCar) {
    this.tyCar = tyCar;
  }

  public void setKmOdometer(int kmOdometer) {
    this.kmOdometer = kmOdometer;
  }

  /** Constructors **/

  public Car() {
    this("Mazda", "red", 1600, 10);
  }

  public Car(String tyCar, String color) {
    this(tyCar, color, 1600, 10);
  }

  public Car(int sizeEngine, int kmOdometer) {
    this("Mazda", "red", sizeEngine, kmOdometer);
  }

  public Car(String tyCar, String color, int sizeEngine, int kmOdometer) {
    this.tyCar = tyCar;
    this.color = color;
    this.sizeEngine = sizeEngine;
    this.kmOdometer = kmOdometer;
    cars.add(this);
  }

  /** Methods **/

  // Drives car input km
  public void drive(int kms) {
    this.kmOdometer += kms;

    String message;

    if(kms < 20) {
      message = "brrm, " + this.color + " " + this.tyCar + " just drove around town " + kms + " clicks.";
    } else if (kms < 50) {
      message = "brrm, screech, brrm, screech; " + this.tyCar + " commuted " + kms + " clicks.";
    } else {
      message = "whee, " + this.tyCar + " " + kms + " clicks.";
    }

    System.out.println(message);
  }

  // Returns the main parameters of the car in a sentence.
  public String toString() {
    return "This " + this.tyCar + " is " + this.color + ", " +
            "has " + this.sizeEngine + " cc engine" +
            "and clocked " + this.kmOdometer + " km's";
  }

}
