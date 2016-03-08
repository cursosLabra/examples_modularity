package srp.ok;

public class Rectangle implements Shape {
  
  final double height;
  final double width;
  
  Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double area() {
    return height * width;
  }
}
