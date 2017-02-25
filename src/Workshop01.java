import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by kond on 2017. 02. 24..
 */
public class Workshop01 {
  public static void main(String[] args) {

    String[] colors = {"white", "blue", "red", "silver", "black", "green", "banana"};
    String[] makes = {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"};
    int[] sizes = {1100, 1400, 1600, 1800, 2500};

    // Define cars
    for(int i=0; i<40; i++) {
      Random rnd = new Random();
      String tyCar = makes[rnd.nextInt(makes.length)];
      String color = colors[rnd.nextInt(colors.length)];
      int sizeEngine = sizes[rnd.nextInt(sizes.length)];
      Car car = new Car(tyCar, color, sizeEngine, 0);
    }

    ArrayList<Car> lsCars = Car.getCars();

    int i = 2;
    // Print car infos
    for(Car car : lsCars) {
      if(i > 0) {
        Random rnd = new Random();
        car.drive(rnd.nextInt(100));
        System.out.println(car.toString());
        i--;
      }
    }
  }
}
