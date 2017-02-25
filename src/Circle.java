/**
 * Created by kond on 2017. 02. 25..
 */
public class Circle {
  /** Properties **/
  protected double radius;
  protected int objects = 0;

  /** Contructors **/
  public Circle() {
    this(1.0);
  }

  public Circle(double radius) {
    this.radius = radius;
    objects++;
  }

  /** Getters **/
  public double getRadius() {
    return this.radius;
  }

  public int countObjects() {
    return this.objects;
  }

  /** Methods **/
  public double getPerimeter() {
    return (this.radius * 2 * Math.PI);
  }

  public double getArea() {
    return (Math.pow(this.radius, 2) * Math.PI);
  }

}
