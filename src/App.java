/**
 * Created by kond on 2017. 02. 24..
 */
public class App {
  public static void main(String[] args){
    Car myCar = new Car();
    System.out.printf("Just got a new Car, it's %s and has a %d cc Engine!\n",
            myCar.getColor() , myCar.getEngineCc() // replace this stuff with the way we get those attributes about myCar
    );
  }
}
