package srp.bad;

public class Circle implements Shape {
  final double radius;
  
  Circle(double r) {
    this.radius = r;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}
