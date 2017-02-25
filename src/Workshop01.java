import java.util.ArrayList;

/**
 * Created by kond on 2017. 02. 24..
 */
public class Workshop01 {
  public static void main(String[] args) {
    ArrayList<Car> cars = new ArrayList<Car>();

    Car car1 = new Car();
    car1.setTyCar("Mazda");
    car1.setKmOdometer(12312);
    cars.add(car1);

    Car car2 = new Car();
    car2.setTyCar("Ford");
    car2.setColor("silver");
    car2.setSizeEngine(2500);
    car2.setKmOdometer(152312);
    cars.add(car2);

    Car car3 = new Car();
    car3.setTyCar("Beamer");
    car3.setColor("green");
    car3.setSizeEngine(2800);
    car3.setKmOdometer(42521);
    cars.add(car3);

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

    /**
     * This Mazda is red, has 1600 cc engine and clocked 12312 km's.
     * This Ford is silver, has 2500 cc engine and clocked 152312 km's.
     * This Beamer is green, has 2800 cc engine and clocked 42521 km's.
     */
    for(Car car : cars) {
        System.out.println(car.toString());
    }
  }
}
