package ocp.colors;

import java.util.ArrayList;
import java.util.List;

public class Driver {
  public static void main(String[] args) throws Exception {
    
    List<Product> products = new ArrayList<Product>();
    products.add(new Product("red", 34));
    products.add(new Product("blue", 45));
    products.add(new Product("red", 13));
    
    SelectProductsOK selector = new SelectProductsOK(products);

    List<Product> redProducts = selector.filter(p -> p.color.equals("red"));
    System.out.println("Red products: " + redProducts);
    List<Product> biggerProducts = selector.filter(p -> p.area > 30);
    System.out.println("Bigger products: " + biggerProducts);
  }
}
