import java.util.ArrayList;

/**
 * Created by kond on 2017. 02. 24..
 */
public class Workshop01 {
  public static void main(String[] args) {
    ArrayList<Car> cars = new ArrayList<Car>();

    // Define cars
    Car car1 = new Car("Mazda", "red", 1600, 12312);
    Car car2 = new Car("Ford", "silver", 2500, 152312);
    Car car3 = new Car("Beamer", "green", 2800, 42521);
    Car myCar05 = new Car("Opel", "white", 1400, 25);
    Car myCar06 = new Car("VW", "grey"); // defaults to 1600 cc, 10 kms
    Car myCar07 = new Car(1100, 15); // defaults to a red Mazda

    // Add cars to list
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.add(myCar05);
    cars.add(myCar06);
    cars.add(myCar07);

    // Drive cars
    car1.drive(15);
    System.out.printf("The %s %s odometer now shows %d\n",
            car1.getColor(),
            car1.getTyCar(),
            car1.getKmOdometer());

    car3.drive(49);
    System.out.printf("The %s %s odometer now shows %d\n",
            car3.getColor(),
            car3.getTyCar(),
            car3.getKmOdometer());

    car2.drive(1200);
    System.out.printf("The %s %s odometer now shows %d\n",
            car2.getColor(),
            car2.getTyCar(),
            car2.getKmOdometer());

    // Print car infos
    for(Car car : cars) {
        System.out.println(car.toString());
    }
  }
}
