package ocp.bad;

import java.util.ArrayList;
import java.util.List;

public class Driver {

  public static void main(String[] args) throws Exception {
    List<Object> shapes = new ArrayList<Object>();
    shapes.add(new Rectangle(2,3));
    shapes.add(new Circle(4));
    
    AreaCalculator calculator = new AreaCalculator(shapes);
    CalculatorOutputter output = new CalculatorOutputter(calculator);
    
    System.out.println("XML: " + output.toXML());
    System.out.println("HTML: " + output.toHTML());
    System.out.println("JSON: " + output.toJSON());
    
  }

}