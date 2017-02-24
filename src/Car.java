/**
 * Created by kond on 2017. 02. 24..
 */
public class Car {
  //Add somethings here to create a car and some fields
  private String color = "red";
  private int engineCc = 1600;
  private String type = "";
  private int kmOdometer = 0;

  public String getColor() {
    return color;
  }

  public int getEngineCc() {
    return engineCc;
  }

  public String getType() {
    return type;
  }

  public int getKmOdometer() {
    return kmOdometer;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setKmOdometer(int kmOdometer) {
    this.kmOdometer = kmOdometer;
  }
}
