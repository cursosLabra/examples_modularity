package isp.toys.ok;

public class Robot implements Toy, Actionable {
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
    System.out.println("Robot is walking...");
  }

  @Override
  public void speak() {
    System.out.println("Robot is speaking...");
  }
  
  @Override 
  public String toString() {
    return "Robot[" + price + "," + color + "]";
  }
}
