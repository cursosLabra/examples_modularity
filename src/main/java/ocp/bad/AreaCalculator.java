package ocp.bad;

import java.util.List;

public class AreaCalculator {

  List<Object> shapes;

  AreaCalculator(List<Object> shapes) {
    this.shapes = shapes;
  }

  double sum() throws Exception {
    double total = 0;
    for (Object shape : shapes) {
      if (shape.getClass() == Circle.class) {
        Circle c = (Circle) shape;
        total += c.radius * c.radius * Math.PI;
      } else if (shape.getClass() == Rectangle.class) {
        Rectangle r = (Rectangle) shape;
        total += r.height * r.width;
      } else throw new Exception("Unsupported class of shape " + shape);
      
    }
    return total;
  }

}
