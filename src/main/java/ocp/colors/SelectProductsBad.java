package ocp.colors;

import java.util.ArrayList;
import java.util.List;

public class SelectProductsBad {

  List<Product> products;
  
  List<Product> filterByColor(String color) {
    List<Product> products = new ArrayList<Product>();
    for (Product p: products) {
      if (p.color.equals(color)) {
        products.add(p);
      }
    }
    return products;
  }
  
  List<Product> filterByArea(double area) {
    List<Product> products = new ArrayList<Product>();
    for (Product p: products) {
      if (p.area > area) {
        products.add(p);
      }
    }
    return products;
  }
}
