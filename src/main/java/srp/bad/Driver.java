package srp.bad;

import java.util.ArrayList;
import java.util.List;

public class Driver {

  public static void main(String[] args) throws Exception {
    List<Shape> shapes = new ArrayList<Shape>();
    shapes.add(new Rectangle(2,3));
    shapes.add(new Circle(4));
    AreaCalculator calculator = new AreaCalculator(shapes);
    System.out.println(calculator.output());
  }

}