/**
 * Created by kond on 2017. 02. 24..
 */
public class Car {
  //Add somethings here to create a car and some fields
  private String color;
  private int sizeEngine;
  private String tyCar;
  private int kmOdometer;


  // Getters
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

  // Setters

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

  // Constructors
  public Car() {
    sizeEngine = 1600;
    color = "red";
  }

  // Methods

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

}
