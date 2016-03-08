package fluent;

public class Product {

  String name;
  Double price;
  
  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }
  
  public Product setPrice(Double price) {
    this.price = price;
    return this;
  }
  
  public Product setName(String name) {
    this.name = name;
    return this;
  }
  
  @Override 
  public String toString() {
    return "Product[" + name + "," + price + "]";
  }

}
