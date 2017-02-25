/**
 * Created by kond on 2017. 02. 25..
 */
public class Workshop02 {
  public static void main(String[] args) {
    // Define circle objects
    Circle circle1 = new Circle();
    Circle circle2 = new Circle(20);

    // Tests
    System.out.println("circle1 |\tperimeter: " + circle1.getPerimeter() +
                        "\tarea: " + circle1.getArea());
    System.out.println("circle2 |\tperimeter: " + circle2.getPerimeter() +
            "\tarea: " + circle2.getArea());

  }
}
