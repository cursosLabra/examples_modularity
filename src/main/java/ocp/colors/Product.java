package ocp.colors;

public class Product {

  public String color;
  public double area;
  
  Product(String color,double area) {
    this.color = color;
    this.area = area;
  }
  
  @Override 
  public String toString() {
    return "product(" + color + "," + area + ")";
  }
}
