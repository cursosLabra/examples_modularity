package fluent;

public class Driver {

  public static void main(String[] args) throws Exception {
    Product p = new Product("PP",23.0);
    System.out.println("Product: " + p);
    
    p.setName("qq").setPrice(45.0);
    
    System.out.println("Product: " + p);

  }

}
