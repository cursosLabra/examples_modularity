package fluent.bad;

public class Product {

  String name;
  Double price;
  
  public Product(String name, Double price) {
    this.name = name;
    this.price = price;
  }
  
  public void setPrice(Double price) {
    this.price = price;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  @Override 
  public String toString() {
    return "Product[" + name + "," + price + "]";
  }

}
