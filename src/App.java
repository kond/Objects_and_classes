/**
 * Created by kond on 2017. 02. 24..
 */
public class App {
  public static void main(String[] args){
    Car myCar = new Car();

    // km's set to 12312
    // type should be Mazda
    myCar.setKmOdometer(12312);
    myCar.setType("Mazda");

    //sout "This %s is %s, has %d cc engine and clocked %d km's\n"
    System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n",
            myCar.getType(), myCar.getColor(), myCar.getEngineCc(), myCar.getKmOdometer()
    );
  }
}
