package srp.bad;

import java.util.List;

public class AreaCalculator {

  List<Shape> shapes;

  AreaCalculator(List<Shape> shapes) {
    this.shapes = shapes;
  }

  double sum() {
    double total = 0;
    for (Shape shape : shapes) {
      total += shape.area();
    }
    return total;
  }

  /**
   * @return HTML output of the sum of areas 
   */
  public String output() {
    return "<h1>" + "Sum of areas = " + sum() + "</h1>";
  }
}
