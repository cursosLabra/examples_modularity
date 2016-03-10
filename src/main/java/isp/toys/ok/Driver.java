package isp.toys.ok;

public class Driver {

  public static void main(String[] args) throws Exception {
    Robot r2d2 = new Robot();
    r2d2.setPrice(23.5);
    r2d2.walk();
    r2d2.speak();
    
    Toy teddy = new TeddyBear();
    teddy.setColor("brown");
  }
}
