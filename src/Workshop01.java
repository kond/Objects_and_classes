import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by kond on 2017. 02. 24..
 */
public class Workshop01 {
  public static void main(String[] args) {

    System.out.println("Number of Cars Available = " + Garage.getCount());

    // Define cars
    Garage garage = new Garage();

    System.out.println("Number of Cars Available = " + Garage.getCount());

    for(int i=0; i<40; i++) {
      garage.addRandomCar();
    }

    ArrayList<Car> lsCars = Garage.getCars();

    System.out.println("Number of Cars Available = " + Garage.getCount());
  }
}
