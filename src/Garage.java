import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kond on 2017. 02. 25..
 */
public class Garage {
  /** Properties **/

  protected static ArrayList<Car> cars = new ArrayList<Car>();
  protected static int countCar = -1;
  private static String[] colors = {"white", "blue", "red", "silver", "black", "green", "banana"};
  private static String[] makes = {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"};
  private static int[] sizes = {1100, 1400, 1600, 1800, 2500};

  /** Constructors **/

  public Garage() {
    for(int i=0; i<5; i++) {
      addRandomCar();
    }
  }

  /** Getters **/
  public static ArrayList<Car> getCars() {
    return cars;
  }

  public static int getCount() {
    return countCar;
  }

  /** Methods **/

  private void addCarToGarage(Car car) {
    cars.add(car);
    countCar++;
  }

  public void addRandomCar() {
    Random rnd = new Random();

    String tyCar = makes[rnd.nextInt(makes.length)];
    String color = colors[rnd.nextInt(colors.length)];
    int sizeEngine = sizes[rnd.nextInt(sizes.length)];
    int kmOdometer = rnd.nextInt(100000);
    Car car = new Car(tyCar, color, sizeEngine, kmOdometer);
    addCarToGarage(car);

    System.out.println("New car in the garage: " + car.toString());
  }

  public void addCar(Car car) {
    addCarToGarage(car);

    System.out.println("New car in the garage: " + car.toString());
  }
}
