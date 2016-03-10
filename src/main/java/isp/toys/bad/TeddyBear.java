package isp.toys.bad;

public class TeddyBear implements Toy {
  private Double price = 0.0;
  private String color = "white";
  
  @Override
  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public void walk() {
    // do nothing...TeddyBears don't walk
  }

  @Override
  public void speak() {
    // do Nothing...TeddyBears don't speak
  }
  
  @Override 
  public String toString() {
    return "TeddyBear[" + price + "," + color + "]";
  }
}
