/**
 * Created by kond on 2017. 02. 26..
 */
public class WarApp {
  public static void main(String[] args) {
    Armada armada1 = new Armada();
    Armada armada2 = new Armada();

    armada1.establishArmada();
    armada2.establishArmada();

    armada1.war(armada2);
  }
}
