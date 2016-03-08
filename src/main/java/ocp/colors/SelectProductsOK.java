package ocp.colors;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SelectProductsOK {

  List<Product> products;
  
  public SelectProductsOK(List<Product> products) {
    this.products = products;
  }
  
  List<Product> filter(Function<Product,Boolean> criteria) {
    List<Product> filtered = new ArrayList<Product>();
    for (Product p: products) {
      System.out.println("Product..." + p);
      if (criteria.apply(p)) {
        filtered.add(p);
      }
    }
    return filtered;
  }
  
}
